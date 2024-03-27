package week03.fileio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.RemoteException;

public class FileWriterExample01 {
    public static void main(String[] args) throws IOException {
        File filewriter = null;

        //Filewriter
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(" fileWriter.txt");
            fileWriter.write("Merhaba file!");
            fileWriter.write("abc \n"); //burada \n alt satıra geçmeye yarar
            fileWriter.write(System.lineSeparator());
            fileWriter.write("abc");
            fileWriter.write("\r\n");
            fileWriter.write("nextline!");
            fileWriter.flush(); // flush yazılan her şeyi yollar
        } catch (IOException e) {
            throw new RuntimeException(e);

        } finally {
            if (fileWriter != null) {
                fileWriter.close();

            }

        }
        FileReader fileReader = new FileReader("FileWriter.txt");
        int i;
        while ((i = fileReader.read()) != -1) {
            System.out.println((char) i);
        }
        fileReader.close();

    }
}
