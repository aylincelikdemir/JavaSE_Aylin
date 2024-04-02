package week04.finalexamples.örnek03;

public class Main {
    public static void main(String[] args) {
        final Person person=new Person("Aylin");
        person.setAge(10);
        System.out.println(person.getName()+""+ person.getAge());
       // person=new Person("Aylin"); -> person'a
    }
}
