package week04.gecerics;

public class GenericClassTExtendsA  <T extends String>{
    public void display(){
        System.out.println( "This is a bounded type generics class.");

    }

    public static void main(String[] args) {
        GenericClassTExtendsA<Integer>inObhj=new GenericClassTExtendsA<Integer>();
    }
}
