package week03.arrays;

public class ArrayQ1 {
    public static void main(String[] args) {
        int [] numberArr = {2,-9,0,5,12,-25,22,9,8,12};
        int toplam=0;
        double ortalama;
        for (int number :numberArr) {
            toplam+= number;
        }

        System.out.print(toplam);
        ortalama= (double) toplam/numberArr.length;
        System.out.print(ortalama);
    }
}
