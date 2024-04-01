package week02.week04.abstraction.örnek01;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double colculateArea() {
        return Math.PI*Math.pow(radius,2);
    }
}
