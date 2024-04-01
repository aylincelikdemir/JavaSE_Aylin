package week03.inheritance.ornek01.ornek02;



public class Circle extends Shape {
    double radius;
    Circle (String color, double radius){
        super(color);
        this.radius=radius;

    }


    @Override
    void draw(){
        System.out.println("drawig a shape");
    }

    @Override
    double calculateArea() {

        return Math.PI*Math.pow(radius,2);
    }
    //return Math.PI*radius*radius;


}
