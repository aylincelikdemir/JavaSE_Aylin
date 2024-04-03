package week04.collections.list.arraylist.linkedlist;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedList02 {
    public static void main(String[] args) {
        Deque<String> animalList =new LinkedList<>();

        //Elaman ekleme
        animalList.add(" Cow");
        System.out.println(" LinkedList:"+ animalList);
        animalList.addFirst(" Dog");
        System.out.println(" Linkedlist:"+animalList);

        //Son indexten eleman ekleme
        animalList.addLast(" Cat");
        System.out.println( "LinkedList :" +animalList);

        //İlk indexten eleman silme
        animalList.removeFirst();
        System.out.println(" LinkedList after removeFirst() :"+animalList);

        //Son indexten eleman silme
        animalList.removeFirst();
        System.out.println(" LinkedList after removeLast() :"+animalList);
    }
}
