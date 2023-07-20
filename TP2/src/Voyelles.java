package TP2.src;
import java.util.*;
/**
 * Cette classe traite les voyelles thaïs en les convertissant en leur
 * équivalent API selon le tableau de conversion.
 */
public class Voyelles {
    private final Map<String, String> voyelles = new HashMap<>();

    /**
     * Récupère la voyelle thaïlandaise et retourne son équivalent en API.
     * @param key La combinaison de voyelle à vérifier.
     * @return L'équivalent de la voyelle en API.
     */
    public String getVoyelles(String key) {
        System.out.println("Combinaison: " + voyelles.get(key));
        return voyelles.get(key);
    }

    /**
     * Initialise la map avec les voyelles thaïlandaises et leur équivalent API.
     */
    public void setTabVoyelles() {
        //VOYELLES COURTES
        voyelles.put("ci u0E30 ","u0061u0294");
        voyelles.put("ci ", "u0061u0294");
        voyelles.put("ci u0E31 cf ","u0061u0294");
        voyelles.put("ci u0E34 ","u0069");
        voyelles.put("ci u0E34 cf ","u0069");
        voyelles.put("ci u0E36 ","u026F");
        voyelles.put("ci u0E36 cf ","u026F");
        voyelles.put("ci u0E38 ","u0075");
        voyelles.put("ci u0E38 cf ","u0075");
        voyelles.put("u0E40 ci u0E30 ","u0065");
        voyelles.put("u0E40 ci u0E47 cf ","u0065");
        voyelles.put("u0E41 ci u0E30 ","u025Bu0294");
        voyelles.put("u0E41 ci u0E47 cf ","u025Bu0294");
        voyelles.put("u0E42 ci u0E30 ","u006Fu0294");
        voyelles.put("ci cf ","u006Fu0294");
        voyelles.put("u0E40 ci u0E32 u0E30 ","u0254u0294");
        voyelles.put("ci u0E47 u0E2D cf ","u0254u0294");
        voyelles.put("u0E40 ci u0E2D u0E30 ","u0264u0294");
        voyelles.put("u0E40 ci u0E35 u0E22 u0E30 ","u0069u0061u0294");
        voyelles.put("u0E40 ci u0E37 u0E2D u0E30 ","u026Fu0061u0294");
        voyelles.put("ci u0E31 u0E27 u0E30 ","u0075u0061u0294");
        voyelles.put("ci u0E34 u0E27 ","u0069u0077");
        voyelles.put("u0E40 ci u0E47 u0E27 ","u0065u0077");
        voyelles.put("u0E40 ci u0E32 ","u0061u0077");
        voyelles.put("ci u0E31 u0E22 ","u0061u006A");
        voyelles.put("u0E43 ci ","u0061u006A");
        voyelles.put("u0E44 ci ","u0061u006A");
        voyelles.put("u0E44 ci u0E22 ","u0061u006A");
        voyelles.put("ci u0E47 u0E2D u0E22 ","u0254u006A");
        voyelles.put("ci u0E38 u0E22 ","u0075u006A");
        voyelles.put("u0E33 ","u0061u006D");
        voyelles.put("u0E24 ","u0072u026F");
        voyelles.put("u0E26 ","u006Cu026F");
        // FIN VOYELLES COURTES

        //VOYELLES LONGUES
        voyelles.put("ci u0E32 ","u0061u02D0");
        voyelles.put("ci u0E32 cf ","u0061u02D0");
        voyelles.put("ci u0E35 ","u0069u02D0");
        voyelles.put("ci u0E35 cf ","u0069u02D0");
        voyelles.put("ci u0E37 u0E2D ","u026Fu02D0");
        voyelles.put("ci u0E37 cf ","u026Fu02D0");
        voyelles.put("ci u0E39 ","u0075u02D0");
        voyelles.put("ci u0E39 cf ","u0075u02D0");
        voyelles.put("u0E40 ci ","u0065u02D0");
        voyelles.put("u0E40 ci cf ","u0065u02D0");
        voyelles.put("u0E41 ci ","u025Bu02D0");
        voyelles.put("u0E41 ci cf ","u025Bu02D0");
        voyelles.put("u0E42 ci ","u006Fu02D0");
        voyelles.put("u0E42 ci cf ","u006Fu02D0");
        voyelles.put("ci u0E2D ","u0254u02D0");
        voyelles.put("ci u0E2D cf ","u0254u02D0");
        //voyelles.put("ci cf ","u0254u02D0");
        voyelles.put("u0E40 ci u0E2D ","u0264u02D0");
        voyelles.put("u0E40 ci u0E34 cf ","u0264u02D0");
        voyelles.put("u0E40 ci u0E2D cf ","u0264u02D0");
        voyelles.put("u0E40 ci u0E35 u0E22 ","u0069u0061");
        voyelles.put("u0E40 ci u0E35 u0E22 cf ","u0069u0061");
        voyelles.put("u0E40 ci u0E37 u0E2D ","u026Fu0061");
        voyelles.put("u0E40 ci u0E37 u0E2D cf ","u026Fu0061");
        voyelles.put("ci u0E31 u0E27 ","u0075u0061");
        voyelles.put("ci u0E27 cf ","u0075u0061");
        voyelles.put("u0E40 ci u0E27 ","u0065u02D0u0077");
        voyelles.put("u0E34 ci u0E27 ","u025Bu02D0u0077");
        voyelles.put("ci u0E32 u0E27 ","u0061u02D0u0077");
        voyelles.put("u0E40 ci u0E35 u0E22 u0E27 ","u0069u0061u0077");
        voyelles.put("ci u0E32 u0E22 ","u0061u02D0u006A");
        voyelles.put("ci u0E2D u0E22 ","u0254u02D0u006A");
        voyelles.put("u0E42 ci u0E22 ","u006Fu02D0u006A");
        voyelles.put("u0E40 ci u0E22 ","u0264u02D0u006A");
        voyelles.put("ci u0E27 u0E22 ","u0075u0061u006A");
        voyelles.put("u0E40 ci u0E37 u0E2D u0E22 ","u026Fu0061u006A");
        voyelles.put("u0E24 u0E45 ","u0072u026Fu02D0");
        voyelles.put("u0E26 u0E45 ","u006Cu026Fu02D0");
    }
}
