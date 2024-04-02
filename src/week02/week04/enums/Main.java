package week02.week04.enums;

public class Main {
    public static void main(String[] args) {
        System.out.println(Size.SMALL);
        System.out.println(Size.MEDIUM);
        Test test= new Test(Size.EXTRALARGE);
        test.orderPizza();

        System.out.println( "---ORDİNAL---");
        //ordinal() metodu bana index döndü
        System.out.println(Size.SMALL.ordinal());
        System.out.println(Size.MEDIUM.ordinal());
        System.out.println(Size.LARGE.ordinal());
        System.out.println(Size.EXTRALARGE.ordinal());

        System.out.println( "\n ----compareTo-----");
        System.out.println(Size.SMALL.compareTo(Size.MEDIUM));
        System.out.println(Size.MEDIUM.compareTo(Size.SMALL));
        System.out.println(Size.EXTRALARGE.compareTo(Size.LARGE));

        System.out.println(" \n--toString----");
        System.out.println(Size.EXTRALARGE.toString());
        String strl =Size.EXTRALARGE.toString();
        if (Size.EXTRALARGE.toString().equals( "EXTRALARGE")){
            System.out.println("toString.equals");
        }

        System.out.println(" \n--name method----");
        if (Size.EXTRALARGE.name().equals(" EXTRALARGE")){
            System.out.println("equals name method");
        }



    }

}
