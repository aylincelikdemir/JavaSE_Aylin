package week03.inheritance.ornek01.ornek02;

public class Shape {
    String color;

    public Shape(String color){
        this.color =color;
    }

      void draw(){
        System.out.println(" Drawing a shape");
    }
    //Final değikeninde tek bir ayraç var
   // değşken olduğu parantezden parametresiz ise anlaşılır
    double calculateArea(){
          return 0.0;
    }
}
