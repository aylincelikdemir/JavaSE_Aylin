package week04.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample04 {
    public static void main(String[] args) {
        HashMap<Integer, String> languageHaschMap = new HashMap<>();

        languageHaschMap.put(1, " Java");
        languageHaschMap.put(2, " Phyton");
        languageHaschMap.put(3, " C");
        System.out.println("HashMap :" + languageHaschMap);


        //anahtarlar üzerinden iterasyon
        System.out.println(" ıteration through keys");
        for (Integer key : languageHaschMap.keySet()) {
            System.out.println(key);
            System.out.println(" ,");
        }
        //değerler üzerinden iterasyon
        System.out.println(" ıteration through values");
        for (String value : languageHaschMap.values()) {
            System.out.println(value);
            System.out.println(" ,");

        }
        //anahtar /değer çifti üzerinden iterasyon
        System.out.println( "ıteration through key/value pairs");
        for (Map.Entry<Integer,String> entry:languageHaschMap.entrySet()){
            System.out.println(entry);
        }
    }
}
