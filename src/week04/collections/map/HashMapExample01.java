package week04.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample01 {
    public static void main(String[] args) {
        Map<String,String> map =new HashMap<>();
        //put yeni değer üretir.replace ise yeni değer ile değiştirir.oldValue yeni değer
        // ile değiştirir (yani böyleyse, şöyleyse) değişilen değer newValue yönlendirilir.
        HashMap<String,Integer> lanuageHashMap =new HashMap<>();
        //elemanlae ekleyelim.
        lanuageHashMap.put("Java",8);
        lanuageHashMap.put("Python",1);
        lanuageHashMap.put("JavaScript",3);
        System.out.println( "HashMap:"+lanuageHashMap);

    }
}
