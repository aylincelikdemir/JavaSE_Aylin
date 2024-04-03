package week04.collections.list.arraylist.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedList01 {
    public static void main(String[] args) {
        //FİFO felsefesiyle çalışır. (First in First out) -> ilk gelen ilk çıkar.
        Queue<String> languagesQuaue =new LinkedList<>();

        //Elamanlar ekleyelim
        languagesQuaue.add("Python");
        languagesQuaue.add("Java");
        languagesQuaue.add("C");
        System.out.println("LinkedList:"+languagesQuaue);

        //En baştaki elemana erişelim
        String str1 =languagesQuaue.peek(); //en baştaki elemanı görüntüler
        System.out.println("Accessed Element:"+str1);

        //en baştaki elemana erişelim aynı zamanda da listeden çıkaralım.
        String str2 =languagesQuaue.poll();
        System.out.println("Removed element :"+str2);
        System.out.println("LinkedList after poll() :"+str2);

        //Listenin sonuna eleman ekleyelim.
        languagesQuaue.offer( "Swift");
        System.out.println(" LinkedList after ofter() :"+languagesQuaue);


    }


}
