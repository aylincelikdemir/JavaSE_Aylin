package week03.methods.staticmethods;

import java.awt.font.FontRenderContext;
import java.util.Scanner;

public class MethodQuestion {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.print(" lütfen 1.sayıyı giriniz :");
        int num1 = scanner.nextInt(); // - > scanner.nextInt()+ "/n ";
        scanner.nextLine();
        System.out.print( "lütfen 2. sayiyi giriniz :");
        int num2 = Integer.parseInt(scanner.nextLine()); // ınteger.pardeInt(<"\n")

        int min;
        int max;
        if (num1 >num2){
           max=num1;
            min=num2;
        }else {
            max=num2;
           min=num1;
       }
        for ( int i= min; i <=max; i++){
            System.out.println(MethodQuestion.getSquare(i));
        }


        MethodQuestion methodQuestion = new MethodQuestion();
        //yapıcı metod olduğu için baş harfleri büyük olur. yaoıcı metodlara -> constructor metod denir.
       long square= methodQuestion.getSquare(5);
       System.out.println(square);
       //getSquare ile medotumu çağırdım

    }

    public static long getSquare(int number){
        //       return (long) Math.pow(number,2);
       return number*number;
    }
}
