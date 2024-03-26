package week03.methods.exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class ChackedException {
    public static void main(String[] args) {
        try {
            FileWriter fw= new FileWriter(" file.txt");
        } catch (Exception e){
            e.printStackTrace();
        }


    }

}



