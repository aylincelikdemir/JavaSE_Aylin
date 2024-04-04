package week04.gecerics;

public class GenericMethodExample {

    public  static  <T> void  printArry(T[] array){
        for (T element : array){
            System.out.println(element+ "");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] integerArry={1,2,3,4,5};
        Double[] doubleArry={1.3,2.6,3.9,4.12,5.55};
        String[] stringArry={ "apple"," banana", "pineapple", "cherry", "watermelon"};
        System.out.println( "integer Array");
        printArry(integerArry);
    }
}
