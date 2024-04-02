package week04.finalexamples.örnek03;

public class Person {
    private final String name;

    private int age;

    public Person(String name){
        this.name=name;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age){
        this.name =name;
        this.age=age;

    }
}
