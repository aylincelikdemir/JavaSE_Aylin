package week02.week04.wrapper;

public class Wrapper {
    public static void main(String[] args) {
        Boolean b1=new Boolean(true);
        Boolean b2=new Boolean(" true");
        Boolean b3=new Boolean( "bilge");

        System.out.println( "\n---Boolen---");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);


        Byte byte1 =new Byte((byte) 5);
        Byte byte2=new Byte(" 50");
        System.out.println( byte1);
        System.out.println(byte2);


        Integer integer1=new Integer(10);
        Integer integer2=new Integer( "15");
        System.out.println(integer1);
        System.out.println(integer2);

    }

}
