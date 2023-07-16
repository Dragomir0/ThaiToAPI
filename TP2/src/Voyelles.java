package TP2.src;

import java.util.*;

public class Voyelles {
    private Map<String, String> voyelles = new HashMap<>();

    public void setVoyelles() {
        //
        voyelles.put("ci u0E34","u0069");
        voyelles.put("ci u0E34 cf","u0069");

        voyelles.put("u0E40 ci u0E35 u0E22 u0E30","u0069 u0061 u0294");

        voyelles.put("ci u0E31 u0E27","u0075 u0061");
        voyelles.put("ci u0E27 cf","u0075 u0061");

    }
    public String getVoyelles(String key) {
        return voyelles.get(key);
    }
}
