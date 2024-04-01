package week02.week04.abstraction.örnek01;

public class Main {

    public static void main(String[] args) {
        //shape sınıfından nesne oluşturulmaz
        //çünkü Shape sınıfı soyut bir sınıftır.
        // Shape shape=new shape();

        System.out.println( "----Rectangle----");
        Rectangle rectangle=new Rectangle(5,3);
        System.out.println(rectangle.colculateArea());
        rectangle.draw();


        System.out.println( "-----Circle------");
        Circle circle=new Circle(3.5);
        System.out.println(circle.colculateArea());
        circle.draw();
    }
}
