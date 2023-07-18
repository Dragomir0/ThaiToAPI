//package TP2.src;
//import java.util.*;
///**********************************************************
// * Cette classe traite les syllabes thaïs et les convertit en API et les affichera
// *
// * @author Dragomir Emilian Mihai
// *         Code permanent: MIHD80070108
// *         Courriel: jf991953@ens.uqam.ca
// *         Cours: INF2120
// * @version 2023-07-11
// **********************************************************/
//public class Thaiv3 {
//    /**
//     * Cette methode main permet de tester la classe Thai avec une syllabe en unicode
//     */
////    public static void main(String[] args) {
////        String texte = "\\u0E17\\u0E12";
////        String syllabeAPI = versAPI(texte);
////        System.out.println(syllabeAPI);
////    }
//
//    /**
//     * Cette methode recoit une chaîne de caractères en Unicode représentant des caractères thaïs et
//     * retourne une chaîne de caractères en Unicode représentant les caractères de l'API
//     *
//     * @param texte qui contient les caractères thaïs à convertir
//     * @return String contenant les caractères convertis en API
//     */
//    public static String versAPI(String texte) {
//        Thaiv3 thai = new Thaiv3();
//        boolean contientCf = false,trouveCombinaison = false,trouverConsonne = false;
//        int indexConsonne = 0;
//        StringBuilder result = new StringBuilder();
//        StringBuilder determinerAPI = new StringBuilder();
//        String ci = "", cf = "";
//
//        Consonnes consonnes = new Consonnes();
//        consonnes.setTabConsonnes();
//        Voyelles voyelles = new Voyelles();
//        voyelles.setTabVoyelles();
//
//        thai.verifierTexteEntree(texte);
//        ArrayList<String> txtEntree = thai.splitTexteEntree(texte);
//
//        System.out.println("Texte entree: " + txtEntree);
//
//        //Tester tous les characters de txtEntree pour voir si voyelle ou consonne
//        for (String s : txtEntree) {
//            //Si pas trouve consonne, chercher dans txtEntree
//            if (!trouverConsonne) {
//                //Si consonne, alors mettre dans determinerAPI
//                if (consonnes.testerSiConsonne(s)) {
//                    ci = consonnes.getConsonnes(s).split(",")[0];
//                    result.append(ci);
//                    determinerAPI.append("ci ");
//                    indexConsonne = txtEntree.indexOf(s);
//                    trouverConsonne = true;
//                    //Determiner si consonne contient cf
//                    if (consonnes.testerSiContientCf(s)) {
//                        contientCf = true;
//
//                    }
//                } else {
//                    //Si pas consonne, alors mettre voyelle dans determinerAPI
//                    determinerAPI.append(s).append(" ");
//                }
//            } else {
//                //Si on a trouve une consonne, append all remaining strings as voyelles
//                determinerAPI.append(s).append(" ");
//                //remove space of last string
//                }
//        }
//
//        //Chercher chaine determinerAPI pour combinaison exacte
//        if (voyelles.getVoyelles(determinerAPI.toString()) != null) {
//            result.append(voyelles.getVoyelles(determinerAPI.toString()));
//            trouveCombinaison = true;
//        }
//        //Si pas trouve de combinaison sans cf dans tab voyelles,
//
//        if (contientCf){
//            //SI contient cf, chercher combinaison avec cf en l'ajoutant dans determinerAPI
//            determinerAPI.append("cf");
//            if (voyelles.getVoyelles(determinerAPI.toString()) != null) {
//                result.append(voyelles.getVoyelles(determinerAPI.toString()));
//                trouveCombinaison = true;
//            }
//        }
//        //chaine pour convertir une voyelle en cf si possible a partir de l'indexConsonne de ci
//        if (trouveCombinaison) {
//            for (int i = indexConsonne + 1; i < txtEntree.size(); i++) {
//                if (!contientCf){
//                    if (consonnes.testerSiContientCf(txtEntree.get(i))) {
//                        cf = consonnes.getConsonnesCf(txtEntree.get(i));
//                        determinerAPI.append("cf");
//                        contientCf = true;
//                    }
//                } else {
//                    determinerAPI.append(txtEntree.get(i)).append(" ");
//                }
//            }
//        }
//        System.out.println("\nDeterminer API: " + determinerAPI + "\n");
//
//        String syllabeAPI = result.toString().trim();
//        syllabeAPI = syllabeAPI.replaceAll("u", "\\\\u");
//        return syllabeAPI;
//    }
//
//    public ArrayList<String> splitTexteEntree(String texte) {
//        ArrayList<String> texteEntree = new ArrayList<>();
//        for (int i = 0; i < texte.length(); i++) {
//            if (texte.charAt(i) == '\\') {
//                texteEntree.add(texte.substring(i + 1, i + 6));
//            }
//        }
//        return texteEntree;
//    }
//
//    public void verifierTexteEntree(String texte) {
//        //si texte vide, retourner message "".
//        if (texte == null || texte.isEmpty()) {
//            System.exit(0);
//        }
//    }
//
//}
