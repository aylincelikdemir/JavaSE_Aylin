package week02.week04.abstraction.örnek04;

public class Goblin extends Enemy{

    public Goblin(){
        this.health =50;
        this.damage =10;
    }

    @Override
    public void attack() {
        System.out.println(" Goblin attacks with"+damage +"damage");
    }
}
