package week03.garbagecollector;

import week03.oop.Test;

public class TesGarbage1 {
    public  void  finelize(){
        System.out.println("object is garbage collected");
    }
    public static void main(String[] args) {
        TesGarbage1 garbage1 = new TesGarbage1();
        // bunlar heapte ayrı yerde tutuluyorlar***
        TesGarbage1 garbage2 = new TesGarbage1();

        TesGarbage1 garbage3= new TesGarbage1();
        /* bunlar heapte aynı nesneyi referans alıyorlar*/
        TesGarbage1 garbage4=garbage3;

        garbage1=null;
        garbage2=null;
        garbage3=null;
        garbage4=null;  // bunun çöpü yokyut çünkü değerini garbage3den alıyor.
        // Yani garbage3 ve garbage4 heapte aynı değere referans almış.

        System.gc();







    }
}
