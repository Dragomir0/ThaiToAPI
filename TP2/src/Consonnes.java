package TP2.src;
import java.util.*;
/**********************************************************
 * Cette classe traite les consonnes thaïs et les affichera
 * les consonnes initiales et finales de l'API selon un tableau
 **********************************************************/
public class Consonnes {
    private final Map<String, String> consonnes = new HashMap<>();
    public void setTabConsonnes() {
        //         Code thaï    ci       ,  cf
       consonnes.put("u0E0D","u006A u00A3,u006E");
       consonnes.put("u0E1C","u0070 u02B0");
       consonnes.put("u0E22","006A,u006A");
       consonnes.put("u0E27","u0077,u0077");
       consonnes.put("u0E28","u0073,u0074");
       consonnes.put("u0E2B","u0068");
    }
    public String getConsonnes(String key) {
        return consonnes.get(key);
    }
    public boolean testerSiConsonne(String key) {
        return consonnes.get(key) != null;
    }
    //Retourne true si contient cf, sinon false
    public boolean testerSiContientCf(String key) {
        return consonnes.get(key).split(",").length > 1;
    }
    //Retourne cf
    public String getConsonnesCf(String key) {
        return consonnes.get(key).split(",")[1];
    }

}
