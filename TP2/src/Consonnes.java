package TP2.src;
import java.util.*;
/**
 * Cette classe traite les consonnes thaïlandaises en les convertissant en leur
 * équivalent API et détermine si une consonne contient ci ou cf.
 */
public class Consonnes {
    private final Map<String, String> consonnes = new HashMap<>();

    /**
     * Récupère la consonne ci si la clé contient un élément avant la virgule
     * @param key La consonne a vérifier.
     * @return La valeur de ci.
     */
    public String getConsonneCi(String key) {
        return consonnes.get(key).split(",")[0];
    }
    /**
     * Récupère la consonne cf si la clé contient un élément après la virgule
     * @param key La consonne a vérifier
     * @return La valeur de cf.
     */
    public String getConsonnesCf(String key) {
        return consonnes.get(key).split(",")[1];
    }
    /**
     * Vérifie si une consonne est présente dans la map.
     * @param key La consonne a vérifier.
     * @return true si la consonne est présente, sinon false.
     */
    public boolean testerSiConsonne(String key) {
        return consonnes.get(key) != null;
    }
    /**
     * Vérifie s'il existe une cf pour une certaine consonne passée en parametre.
     * @param key La consonne a vérifier.
     * @return true si la consonne a une forme finale, sinon false.
     */
    public boolean testerSiContientCf(String key) {
        return consonnes.get(key) != null && consonnes.get(key).contains(",");
    }
    /**
     * Initialise la map avec les consonnes thaïlandaises et leur équivalent API,
     * séparant le ci du cf avec une virgule.
     */
    public void setTabConsonnes() {
        consonnes.put("u0E01","u006B,u006B");
        consonnes.put("u0E02","u006B u02B0,u006B");
        consonnes.put("u0E03","u006B u02B0,u006B");
        consonnes.put("u0E04","u006B u02B0,u006B");
        consonnes.put("u0E05","u006B u02B0,u006B");
        consonnes.put("u0E06","u006B u02B0,u006B");
        consonnes.put("u0E07","u014B,u014B");
        consonnes.put("u0E08","u0074 u0255,u0074");
        consonnes.put("u0E09","u0074 u0255 u02B0");
        consonnes.put("u0E0A","u0074 u0255 u02B0,u0074");
        consonnes.put("u0E0B","u0073,u0074");
        consonnes.put("u0E0C","u0074 u0255 u02B0");
        consonnes.put("u0E0D","u006A,u006E");
        consonnes.put("u0E0E","u0064,u0074");
        consonnes.put("u0E0F","u0074,u0074");
        consonnes.put("u0E10","u0074 u02B0,u0074");
        consonnes.put("u0E11","u0074 u02B0,u0074");
        consonnes.put("u0E12","u0074 u02B0,u0074");
        consonnes.put("u0E13","u006E,u006E");
        consonnes.put("u0E14","u0064,u0074");
        consonnes.put("u0E15","u0074,u0074");
        consonnes.put("u0E16","u0074 u02B0,u0074");
        consonnes.put("u0E17","u0074 u02B0,u0074");
        consonnes.put("u0E18","u0074 u02B0,u0074");
        consonnes.put("u0E19","u006E,u006E");
        consonnes.put("u0E1A","u0062,u0070");
        consonnes.put("u0E1B","u0070,u0070");
        consonnes.put("u0E1C","u0070 u02B0");
        consonnes.put("u0E1D","u0066");
        consonnes.put("u0E1E","u0070 u02B0,u0070");
        consonnes.put("u0E1F","u0066,u0070");
        consonnes.put("u0E20","u0070 u02B0,u0070");
        consonnes.put("u0E21","u006D,u006D");
        consonnes.put("u0E22","u006A,u006A");
        consonnes.put("u0E23","u0072,u006E");
        consonnes.put("u0E25","u006C,u006E");
        consonnes.put("u0E27","u0077,u0077");
        consonnes.put("u0E28","u0073,u0074");
        consonnes.put("u0E29","u0073,u0074");
        consonnes.put("u0E2A","u0073,u0074");
        consonnes.put("u0E2B","u0068");
        consonnes.put("u0E2C","u006C,u006E");
        consonnes.put("u0E2D","u0294");
        consonnes.put("u0E2E","u0068");
    }
}
