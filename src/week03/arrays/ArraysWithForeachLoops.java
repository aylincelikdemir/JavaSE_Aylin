package week03.arrays;

public class ArraysWithForeachLoops {
    public static void main(String[] args) {

        int[]age= {12,5,14,13};//isimlendirmeyi belirtmek için çoğul kullanılmaz örneğin age'yi ageArray yapabiliriz.

        //foreach ile Array'de gezinmek
        for (int patates:age){
            System.out.println(patates);
        }
    }
}
