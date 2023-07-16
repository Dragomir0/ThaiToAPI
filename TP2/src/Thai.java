package TP2.src;
import java.util.*;
/**********************************************************
 * Cette classe
 *
 * @author Dragomir Emilian Mihai
 *         Code permanent: MIHD80070108
 *         Courriel: jf991953@ens.uqam.ca
 *         Cours: INF2120
 * @version 2023-07-11
 **********************************************************/
public class Thai {

    /**
     * Cette methode recoit une chaîne de caractères en Unicode représentant des caractères thaïs et
     * retourne une chaîne de caractères en Unicode représentant les caractères de l'API
     *
     * @param texte qui contient les caractères thaïs à convertir
     * @return String qui contient les caractères de l'API correspondant
     */
    public static String versAPI(String texte) {

        //Entrée : " \u0E0D\u0E34" Sortie : " \u006A\u0069".

        boolean contientCf = false;
        ArrayList<String> texteEntree = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        String ci = "";
        String cf = "";

        //Split String texte into ArrayList texteEntree
        for (int i = 0; i < texte.length(); i++) {
            if (texte.charAt(i) == '\\') {
                texteEntree.add(texte.substring(i + 1, i + 6));
            }
        }
        Consonnes consonnes = new Consonnes();
        consonnes.setConsonnes();
        Voyelles voyelles = new Voyelles();
        voyelles.setVoyelles();
        System.out.println(texteEntree.get(0) + " " + texteEntree.get(1));
        //Tester si 1er lettre est consonne et si contient cf
        if (consonnes.testerSiConsonne(texteEntree.get(0))){
            ci = consonnes.getConsonnes(texteEntree.get(0)).split(",")[0];
            result.append(ci);
            //Teste si contient cf
            if (consonnes.testerSiContientCf(texteEntree.get(0))) {
                cf = consonnes.getConsonnesCf(texteEntree.get(0));
                contientCf = true;
                }
            }
        System.out.println(cf);

//        if (texte == null || texte.isEmpty()) { return ""; }
//        String[] syllables = texte.split(" ");
//        for (String syllable : syllables) {
//
//        }
        return result.toString().trim();
    }
}
