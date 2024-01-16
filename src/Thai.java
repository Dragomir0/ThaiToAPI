package src;

import java.util.*;

/**********************************************************
 * Cette classe traite les syllabes thaïs et les convertit en API
 *
 * @author Dragomir Emilian Mihai
 * @version 2023-07-22
 **********************************************************/
public class Thai {

    /**********************************************************
     * Convertit une chaîne de caractères thaïe en Unicode en son équivalent en API
     * pour chaque segment délimité par un espace
     *
     * @param texte La chaîne de caractères thaïe en Unicode à convertir.
     * @return La chaîne de caractères convertie en API.
     */
    public static String versAPI(String texte) {
        String[] segments = texte.split(" ");
        StringBuilder finalResult = new StringBuilder();

        //Pour chaque syllabe délimitée par un espace, on appelle processSegment
        if(texte.equals("")) {
            //Si vide, retourne une chaîne vide
        } else {
            for (String segment : segments) {
                String segmentResult = traiterSegment(segment);
                finalResult.append(segmentResult).append(" ");
            }
        }
        return finalResult.toString().trim();
    }

    /**********************************************************
     * Traite un segment de texte thaï pour le convertir en API.
     *
     * @param segment Segment de texte thaï en Unicode à traiter.
     * @return La transcription API du segment donné.
     */
    private static String traiterSegment(String segment) {
        Thai thai = new Thai();
        ArrayList<String> txtEntree = thai.splitTexteEntree(segment);

        MutableBoolean consonneTrouvee = new MutableBoolean(false);
        MutableBoolean cfIdentifie = new MutableBoolean(false);
        StringBuilder resultat = new StringBuilder();
        StringBuilder determinerAPI = new StringBuilder();

        Consonnes consonnes = new Consonnes();
        consonnes.setTabConsonnes();
        Voyelles voyelles = new Voyelles();
        voyelles.setTabVoyelles();

        int indexCi = -1;
        // Pour chaque char dans txtEntree, on cherche la première consonne
        for (int i = 0; i < txtEntree.size(); i++) {
            String s = txtEntree.get(i);
            if (!consonneTrouvee.estVrai()) {
                indexCi = thai.trouverEtAjouterCi(s, consonnes, determinerAPI, txtEntree, consonneTrouvee, resultat);
            }
        }

        int indexCf = thai.trouverEtAjouterCf(indexCi, consonnes, txtEntree, cfIdentifie);

        boolean combinaisonTrouvee = false;
        thai.addCharRestants(txtEntree, indexCi, indexCf, determinerAPI, combinaisonTrouvee);

        System.out.println("Test sans cf: " + determinerAPI);
        combinaisonTrouvee = thai.chercherCombinaison(voyelles, determinerAPI, resultat, txtEntree);

        //Eviter d'enlever u0E26 si pas de combinaison trouvee
        if (determinerAPI.toString().equals("u0E24 u0E26 ")) {
            throw new NoSuchElementException();
        }

        //Si pas trouve de combinaison sans cf, on cherche avec cf
        if (!combinaisonTrouvee) {
            determinerAPI.delete(determinerAPI.length() - 6, determinerAPI.length());

            if (cfIdentifie.estVrai()) {
                determinerAPI.append("cf ");
            }

            System.out.println("Test avec cf: " + determinerAPI);
            combinaisonTrouvee = thai.chercherCombinaison(voyelles, determinerAPI, resultat, txtEntree);

            if (indexCf > 0) {
                indexCf = txtEntree.size() - 1;
                String valeurCf = consonnes.getConsonnesCf(txtEntree.get(indexCf));
                resultat.append(valeurCf);
            }
        }
        System.out.println("Combinaison trouvée: " + combinaisonTrouvee);
        estCharThaiValide(combinaisonTrouvee);

        segment = thai.finaliserResultat(resultat);
        return segment;
    }

    /**********************************************************
     * Cherche et ajoute ci au StringBuilder "determinerAPI"
     *
     * @param s Le caractère courant à tester
     * @param consonnes Instance de la classe Consonnes pour tester/obtenir les consonnes
     * @param determinerAPI StringBuilder où le résultat est construit
     * @param txtEntree Liste des caractères à traiter
     * @param consonneTrouvee Indicateur si une consonne a déjà été trouvée
     * @param resultat StringBuilder final qui contiendra la transcription API
     * @return Index de la première consonne trouvée dans txtEntree, sinon -1
     */
    public int trouverEtAjouterCi(String s, Consonnes consonnes, StringBuilder determinerAPI,
                                  ArrayList<String> txtEntree, MutableBoolean consonneTrouvee,
                                  StringBuilder resultat) {
        int indexResultat = -1;
        // Si char pas consonne -> alors voyelle -> ajoute a resultat
        if (!consonnes.testerSiConsonne(s)) {
            determinerAPI.append(s).append(" ");
        }
        // Si pas encore trouve consonne -> cherche 1ere consonne
        else if (!consonneTrouvee.estVrai()) {
            String ci = consonnes.getConsonneCi(s);
            resultat.append(ci);
            determinerAPI.append("ci ");
            consonneTrouvee.setValue(true);
            indexResultat = txtEntree.indexOf(s);
        }
        return indexResultat;
    }

    /**********************************************************
     * Ajoute les caractères restants apres ci et cf à "determinerAPI"
     *
     * @param txtEntree Liste des caractères à traiter
     * @param indexCi Index de la première consonne trouvée
     * @param indexCf Index de la dernière consonne trouvée
     * @param determinerAPI StringBuilder où le résultat est construit
     */
    public void addCharRestants(ArrayList<String> txtEntree, int indexCi, int indexCf, StringBuilder determinerAPI, boolean combinaisonTrouvee) {
        for (int i = indexCi + 1; i < txtEntree.size(); i++) {
            if (i != indexCf || !combinaisonTrouvee) {
                // Si determinerAPI ne contient pas déjà le caractère à l'index i, on l'ajoute car c'est une voyelle
                if (!determinerAPI.toString().contains(txtEntree.get(i))) {
                    determinerAPI.append(txtEntree.get(i)).append(" ");
                }
            }
        }
    }

    /**********************************************************
     * Recherche cf et son index à partir de l'index de ci
     *
     * @param indexCi Index de la première consonne trouvée
     * @param consonnes Instance de la classe Consonnes pour tester/obtenir les consonnes
     * @param txtEntree Liste des caractères à traiter
     * @param cfTrouve Indicateur si la dernière consonne (Cf) a été trouvée
     * @return index de cf
     */
    public int trouverEtAjouterCf(int indexCi, Consonnes consonnes, ArrayList<String> txtEntree, MutableBoolean cfTrouve) {
        int indexResult = -1;
        if (!cfTrouve.estVrai()) {
            int i = indexCi + 1;
            while (i < txtEntree.size() && !consonnes.testerSiContientCf(txtEntree.get(i))) {
                i++;
            }
            if (i < txtEntree.size()) {
                cfTrouve.setValue(true);
                indexResult = i;
            }
        }
        return indexResult;
    }

    /**********************************************************
     * Recherche une combinaison de voyelles dans le tableau de voyelles et l'ajoute à "result"
     *
     * @param voyelles Instance de la classe Voyelles pour obtenir les voyelles
     * @param determinerAPI StringBuilder où le résultat est construit
     * @param resultat StringBuilder final qui contiendra la transcription API
     * @return Vrai si une combinaison est trouvée, sinon faux
     */
    public boolean chercherCombinaison(Voyelles voyelles, StringBuilder determinerAPI, StringBuilder resultat, ArrayList<String> txtEntree) {

        boolean combiTrouvee = false;
        // Si trouve combinaison exacte -> ajoute au resultat
        if (voyelles.getVoyelles(determinerAPI.toString()) != null) {
            resultat.append(voyelles.getVoyelles(determinerAPI.toString()));
            combiTrouvee = true;
        }
        return combiTrouvee;
    }

    /**********************************************************
     * Formate le StringBuilder "result" pour obtenir la transcription API finale
     *
     * @param resultat StringBuilder contenant la transcription API
     * @return Chaîne de caractères représentant la transcription API finale
     */
    public String finaliserResultat(StringBuilder resultat) {
        StringBuilder resFinal = new StringBuilder();

        for (int i = 0; i < resultat.length(); i++) {
            if (resultat.charAt(i) == ' ') {
                resultat.deleteCharAt(i);
                // i-- car longueur a diminué en supprimant l'espace
                i--;
            } else if (resultat.charAt(i) == 'u' && i + 4 < resultat.length()) {
                // Extraire les caractères Unicode des 4 positions suivantes
                String charsUnicode = resultat.substring(i + 1, i + 5);
                // Convertir les caractères Unicode en un caractère Java
                char charJava = (char) Integer.parseInt(charsUnicode, 16);
                // Ajouter le caractère Java au résultat final
                resFinal.append(charJava);
                // Passer 4 positions -> next syllabe
                i += 4;
            }
        }
        System.out.println(resultat);
        return resFinal.toString();
    }

    /**********************************************************
     * Décompose le texte d'entrée (Unicode) en une ArrayList de caractères Thai
     *
     * @param texte Chaîne de caractères à décomposer
     * @return ArrayList<String> contenant chaque caractère Thai du texte d'entrée
     */
    public ArrayList<String> splitTexteEntree(String texte) {
        ArrayList<String> texteEntree = new ArrayList<>();

        for (char ch : texte.toCharArray()) {
            int unicodeValueOfChar = (int) ch;
            String formattedUnicodeValue = String.format("u%04X", unicodeValueOfChar);
            texteEntree.add(formattedUnicodeValue);
        }
        System.out.println("Texte Formaté: " + texteEntree);
        return texteEntree;
    }


    /**********************************************************
     * Vérifie si les caracteres d'entree sont valides
     *
     * @param combinaisonFound Vrai si une combinaison valide a été trouvée, sinon faux
     */
    public static void estCharThaiValide(boolean combinaisonFound) {
        if (!combinaisonFound) {
            throw new NoSuchElementException();
        }
    }
}
