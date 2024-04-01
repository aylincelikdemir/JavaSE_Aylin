package week02.week04.polymorphism.compiletime;

public class Main {
    public static void main(String[] args) {
        MathOperations mathOperations= new MathOperations();
        int result1=mathOperations.add(10,20); //int add(int a, int b) metodu çağıtılır.
        double result2=mathOperations.add(20.5,30.3);// double add(double a, double b) metodu çağırılır.

    }
}
