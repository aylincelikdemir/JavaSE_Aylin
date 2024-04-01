package week04.interfaceexamples.Örnek02;

public class ProgrammingaLanguage implements Language{

    @Override
    public void getNamw(String name){
        System.out.println( "Programming Language:"+ name);

    }
}
