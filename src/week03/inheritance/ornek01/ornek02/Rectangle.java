package week03.inheritance.ornek01.ornek02;

public class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(String color , double width, double height){
        super(color);
        this.width=width;
        this.height=height;
    }

    @Override
    void draw() {
        System.out.printf("Drawing a Rectangle");
    }

    @Override
    double calculateArea() {
   return width*height;
    }
}
