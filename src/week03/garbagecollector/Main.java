package week03.garbagecollector;

import week03.garbagecollector.constructor.NoArgsConstructor;

public class Main {
    private  String name;
    Main(){
        System.out.println("Constructor Called..");
        name=" Constructor name is field."; //kısa yol.
    }



    public static void main(String[] args) {

        Main obj = new Main();
        Main obj2 = new Main();
        obj.name=" Constructor name is field"; //uzun yol
        obj2.name=" Constructor name is field"; //uzun yol
        System.out.println( "The name is :" +obj.name);

    }
}
