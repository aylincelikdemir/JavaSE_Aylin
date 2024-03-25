package week03.methods;

import javax.swing.*;

public class VoitMetods {
    public static void main(String[] args) {
        sayHello("Aylin");

    }

    public static void sayHello(String username) {
        System.out.println("Merhaba" + username.toUpperCase() + " ! Hoşgeldin");

    }

    public static void methodRankPoints(double points) {
        if (points >= 202.5) {
            System.out.println(" Rank : A1");
        } else if (points >= 122.4) {
            System.out.println("Rank : A2");
        } else {
            System.out.println(" Rank : A3");
        }
        }
    }




