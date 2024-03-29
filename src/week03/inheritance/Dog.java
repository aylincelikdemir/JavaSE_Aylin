package week03.inheritance;

public class Dog extends Animal {
    public void display() {
        System.out.println("My name is" + name);

    }

    @Override
    public void eat() {  //Method overriding
        //super.eat(); //superclassdaki eat() metodu.
        //this.eat(); //bu sınıfdaki eat() metodu.
        System.out.println("I eat ");
    }
}

