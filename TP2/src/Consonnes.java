package TP2.src;

import java.util.*;

public class Consonnes {
    private final Map<String, String> consonnes = new HashMap<>();
    public void setConsonnes() {
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
    public boolean testerSiContientCf(String key) {
        return consonnes.get(key).split(",")[1] != null;
    }
    public String getConsonnesCf(String key) {
        return consonnes.get(key).split(",")[1];
    }

}
