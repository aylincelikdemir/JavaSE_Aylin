package week04.collections.map;

import java.util.HashMap;

public class HashMapExample02 {
    public static void main(String[] args) {
        HashMap<Integer, String> languageHaschMap = new HashMap<>();

        languageHaschMap.put(1, " Java");
        languageHaschMap.put(2, " Phyton");
        languageHaschMap.put(3, " C");
        System.out.println("HashMap :" + languageHaschMap);

        //Belirli bir key'e göre key'e denk gelen value'yu döndürür.
        String value = languageHaschMap.get(2);
        System.out.println(" Value at key :" + value);

        //key'leri bir set olarak dönme -> key set ile
        System.out.println("Keys :" + languageHaschMap.keySet());

        //Value'larrı bir set olarak dönme.Sadece değerleri döner
        System.out.println("Values :" + languageHaschMap);

        //key/value pair(çift)'ini bir set olarak dönme
        System.out.println("Key/Value mappings :" + languageHaschMap.entrySet());

        //key varsa Value'sunu dön, yoksa defaultta éNot Found"
        // dön, bu key var, dolayısıyla value döner

        String value1 = languageHaschMap.getOrDefault(1, "Not found");
        System.out.println("Value for key :" + value1);

        //key varsa Valuesını dön, yoksa defaultta  "Not Found "
        // dön, Bu key yok,dolayısıyla default değerini döner.
        String value2 = languageHaschMap.getOrDefault(5, " Not Found");
        System.out.println("Value for key 5:" + value2);

        //Bir key var mıdiye kontrol etmek.
        if (languageHaschMap.containsKey(2)) {
            System.out.println("Map contains key Value of :2");


        } else {
            System.out.println("KEY NOT FOUND");
        }
        //bir value var mı diye kontrol etmek.
        if (languageHaschMap.containsValue(" java")){
            System.out.println(" Map contains value of Java");
        } else {
            System.out.println( "No such value");
        }

        //bir key ile ilişkili Value'yu değiştirmek.(replace())
        System.out.println( "originial HashMap :"+languageHaschMap);
        languageHaschMap.replace(4, "Swift");
        System.out.println( "HashMap after replace() :"+languageHaschMap);

        //Bütün Value değerlerini upperCase'e çevirmek. (replaceAll())
        languageHaschMap.replaceAll((k,V) -> V.toUpperCase());
        System.out.println(" Updated HashMap :"+languageHaschMap);

        //Bir hashMap'den öğeleri kaldırmak/silmek. (remove())
        String value3 = languageHaschMap.remove(4);
        System.out.println( "Removed value :"+value3);
        System.out.println( "Updated HashMap :"+languageHaschMap);

        //Bir hashMap'den bir key /value çiftini kaldırmak/silmek (remove (K,v))
        Boolean isDeled =languageHaschMap.remove(3," C");
        System.out.println(" isdeleted :"+isDeled);
        System.out.println( "Updated :"+languageHaschMap);




    }
}
