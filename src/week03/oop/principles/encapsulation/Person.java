package week03.oop.principles.encapsulation;

public class Person {
    private String name;
    private String tcKimlik;


//Constructor
    //userDefinedMethods
    //getter-Setter methods
    //toString method.

    public String arabaSur() {
        if (age >= 18) ;
        return name + "Arabayı sürüyor";


    }



    public String getName() { //değeri getirir
        return name;
    }

    public void setName(String name) { //değer ataması yapar (setName)
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    private int age;
    private String lastname;

    public void setTcKimlik(String tcKimlik) {
        this.tcKimlik = tcKimlik;
    }
}
