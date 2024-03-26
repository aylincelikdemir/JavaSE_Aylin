package week03.methods.exceptions;

public class HandlinException {
    public static void main(String[] args) {
        int number1 = 5;
        try {
            System.out.println((number1 / 0));
            System.out.println("try blok içi");

        } catch (ArithmeticException e) {
            System.out.println("Caught Aritmethic Exception!");


        } finally {
            System.out.println("merhaba");
            System.out.println("dünya");

        }
        System.out.println(" Kodun Bitişi");

    }
}