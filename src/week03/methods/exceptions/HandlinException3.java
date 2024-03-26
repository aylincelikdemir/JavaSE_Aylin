package week03.methods.exceptions;

public class HandlinException3 {
    public static void main(String[] args) {
        String name=  "Aylin";



        if(name.equals(null)){
            System.out.println(" Lütfen bir isim giriniz!");
        }else {
            System.out.println(name.toUpperCase());
        }
    }
}
