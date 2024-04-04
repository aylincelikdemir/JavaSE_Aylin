package week04.gecerics;

public class Main {
    public static void main(String[] args) {
        GenericClass<Integer> intObj=new GenericClass(5);
        System.out.println(" Generic class returns :"+intObj.getData());

        GenericClass<String> strinObj=new GenericClass<>(" Java Programming");
        System.out.println( "Generic Class returns :"+strinObj.getData());
    }
}
