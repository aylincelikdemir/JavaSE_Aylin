package week03.methods.exceptions;

public class UncaughtException {
    public static void main(String[] args) {


    }

    public  void  method1(String name) {
        System.out.println(" Method1");
        try {
            method2(name);
        } catch (NullPointerException e){
            System.out.println( "Caught NPE");
        }
        System.out.println( "Method1 worked!");
    }
    public void  method2(String name){
        System.out.println( "Method2");
        method3(name);
        System.out.println( "Method2 didn't work!");
    }
    public void method3(String name){
        System.out.println(" Method3");
        try {
            name.toUpperCase();
        }catch (NullPointerException e){
            System.out.println( "NPE");
        }
        System.out.println( "Method3 didn 't work");


    }
}
