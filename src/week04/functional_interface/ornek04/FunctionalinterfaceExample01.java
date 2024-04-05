package week04.functional_interface.ornek04;

public class FunctionalinterfaceExample01 {
    public static void main(String[] args) {
        MathOparetion addition =(a, b) -> a+b;
        MathOparetion subtraction =(a, b) -> a-b;
        MathOparetion multilication =(a, b) -> a*b;
        MathOparetion division =(a, b) -> a/b;

        //lamdaexpression kullanarak işlem yapma

    }
}