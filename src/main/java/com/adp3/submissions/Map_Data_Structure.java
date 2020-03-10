package com.adp3.submissions;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map_Data_Structure {

    Map map;

    public String thirdP4P(){
        map = new LinkedHashMap();

        map.put("figher1", "Floyd Mayweather");
        map.put("fighter2", "Vasyl Lomachenko");
        map.put("fighter3", "Canelo Alverez");
        map.put("fighter4", "Errol TheTruth Spence");

        return (String) map.get("fighter3");
    }

}
