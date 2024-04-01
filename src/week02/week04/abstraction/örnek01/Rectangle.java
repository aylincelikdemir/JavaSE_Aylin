package week02.week04.abstraction.örnek01;

public class Rectangle extends Shape {


    private double width;

    private double height;

    Rectangle(double width, double height){
        this.width=width;
        this.height=height;

    }

    @Override
    public double colculateArea() {
        return width*height;
    }


    //  @Override
//    public double colculateArea(){
//      return 0.0; //override metot ezme
//  }


//    @Override  //2.yöntem alt+ınsert override seç
//    public double colculateArea() {
//        return 0;
//    }
}
