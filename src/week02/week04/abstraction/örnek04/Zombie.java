package week02.week04.abstraction.örnek04;

public class Zombie extends Enemy {

    public Zombie(){
        this.health =100;
        this.damage=5;
    }
    @Override
    public void attack() {
        System.out.println( "Zombie attacks with" +damage+" damage");
    }
}
