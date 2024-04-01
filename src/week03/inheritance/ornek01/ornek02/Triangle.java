package week03.inheritance.ornek01.ornek02;

public class Triangle extends Shape {
    double base;
    double height;


    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    void draw() {
        super.draw();
    }

    @Override
    double calculateArea() {
        return super.calculateArea();
    }
}
