package TP2.src;

import java.util.*;

/**********************************************************
 * Cette classe traite les voyelles thaïs et les convertit en API
 * selon le tableau de conversion
 **********************************************************/
public class Thai {
    public static void main(String[] args) {
        String texte = "\u0E1C\u0E27\u0E28";
        String textev2 = "\u0E42\u0E1B\u0E21";

        String syllabeAPI = versAPI(texte);
        System.out.println(syllabeAPI);
    }

    public static String versAPI(String texte) {
        Thai thai = new Thai();

        ArrayList<String> txtEntree = thai.splitTexteEntree(texte);
        ArrayList<String> txtEntreeCopy = new ArrayList<>(txtEntree);
        int indexConsonne = 0;
        String syllabeAPI;
        String ci = "", cf = "";
        boolean consonneFound = false, combinaisonFound = false, cfTrouve = false;

        Consonnes consonnes = new Consonnes();
        consonnes.setTabConsonnes();
        Voyelles voyelles = new Voyelles();
        voyelles.setTabVoyelles();

        StringBuilder result = new StringBuilder();
        StringBuilder determinerAPI = new StringBuilder();

        //Texte Entree: [u0E42, u0E1B, u0E21]
        for (String s : txtEntreeCopy) {

            consonneFound = thai.processChaqueChar(s, consonnes, determinerAPI, txtEntree, cfTrouve,consonneFound, result, ci, cf);
        }

        combinaisonFound = thai.chercherCombinaison(voyelles, determinerAPI, result, cf, consonneFound);
        System.out.println("Combinaison found: " + combinaisonFound);

        syllabeAPI = thai.finalizeResult(result);
        return syllabeAPI;
    }

    // Trouve la premiere consonne et met le reste des voyelles dans determinerAPsans autre verification
    public boolean processChaqueChar(String s, Consonnes consonnes, StringBuilder determinerAPI,
                                    ArrayList<String> txtEntree, boolean cfTrouve, boolean consonneFound, StringBuilder result, String ci, String cf) {
        int indexCi = 0;
        int indexCf = 0;
        //3x  Texte Entree: [u0E42, u0E1B, u0E21]
        if (consonnes.testerSiConsonne(s) && consonneFound == false) {

            ci = consonnes.getConsonnes(s).split(",")[0];
            result.append(ci);
            indexCi = txtEntree.indexOf(s);
            determinerAPI.append("ci ");
            consonneFound = true;
        }
        //Si on a deja trouve une consonne et qu'on a une autre consonne, on doit ecrire cf a la fin du resultat
        else if (consonneFound == true && cfTrouve == false ) {
            for (int i = indexCi + 1; i < txtEntree.size(); i++) {
                if (consonnes.testerSiContientCf(txtEntree.get(i))) {
                    cf = consonnes.getConsonnesCf(txtEntree.get(i));
                    txtEntree.remove(i);
                    cfTrouve = true;
                    System.out.println("cf trouve " + cfTrouve);
                    indexCf = i;
                    break;
                }
            }
            determinerAPI.append("cf ");
        } else {
            // Si voyelle, on l'ajoute au resultat
            determinerAPI.append(s).append(" ");
            //determinerAPI.append("cf ");
        }
        return consonneFound;
    }

    // Processes the voyelles part of the syllabe
    public boolean chercherCombinaison(Voyelles voyelles, StringBuilder determinerAPI, StringBuilder result, String cf, boolean containsCf) {

        System.out.println("determinerAPI avant test combinaison: " + determinerAPI);
        boolean combinaisonFound = false;
        // Si on a une combinaison exacte, alors on l'ajoute au resultat
        if (voyelles.getVoyelles(determinerAPI.toString()) != null) {
            result.append(voyelles.getVoyelles(determinerAPI.toString()));
            result.append(cf);
            combinaisonFound = true;
        }
        return combinaisonFound;
    }

    // Finalizes the syllabe by removing the last space and appending the syllabe API
    public String finalizeResult(StringBuilder result) {
        StringBuilder finalResult = new StringBuilder();
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == ' ') {
                result.deleteCharAt(i);
                i--; // Decrement i since the length has decreased by deleting the space
            } else if (result.charAt(i) == 'u' && i + 4 < result.length()) {
                // Extract the Unicode characters from the next 4 positions
                String unicodeChars = result.substring(i + 1, i + 5);
                // Convert the Unicode characters to a Java character
                char javaChar = (char) Integer.parseInt(unicodeChars, 16);
                // Append the Java character to the final result
                finalResult.append(javaChar);
                // Skip the next 4 positions since they have been processed
                i += 4;
            }
        }
        return finalResult.toString();
    }

    public ArrayList<String> splitTexteEntree(String texte) {
        ArrayList<String> texteEntree = new ArrayList<>();
        System.out.println("Texte: " + texte);

        StringBuilder sb = new StringBuilder();
        for (char ch : texte.toCharArray()) {
            sb.append(String.format("\\\\u%04X", (int) ch));
        }

        String unicodeText = sb.toString();
        System.out.println("Unicode Text: " + unicodeText);

        String[] split = unicodeText.split("\\\\\\\\u");
        for (String s : split) {
            if (!s.isEmpty()) {
                texteEntree.add("u" + s);
            }
        }
        System.out.println("Texte Entree: " + texteEntree + "\n");
        return texteEntree;
    }

//    public void verifierTexteEntree(String texte) {
//        //si texte vide, retourner message "".
//        if (texte == null || texte.isEmpty()) {
//            System.exit(0);
//        }
//    }
}
