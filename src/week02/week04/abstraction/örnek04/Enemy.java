package week02.week04.abstraction.örnek04;

public abstract class Enemy {

    int health;

    int damage;

    public abstract void  attack(); //abstract method çünkü her düşmanın atağı farklıdır.

    public void takeDamage(int damage){
        health = health - damage;
        System.out.println( "Enemy is damaged :"+ damage);
        System.out.println( "Enemy health is:"+health);

        if (health <= 0){
            System.out.println("Enemy is defeated. - is killed");
        }
    }
}
