package week02.week04.wrapper;

public class BoxinUnboxing {

    int number = 2;
    Integer integer= number; // auto boxing

    Integer integer2=5; //auto boxing

    int number2 = integer2; // autoUnBOXİNG

    //boxing
    Integer boxing = new Integer(100);
    Integer boxing2= Integer.valueOf(100);

    //Auto Un Boxing
    Integer number3=100; //autoboxing
    int autoUnboxing= number3; //auto unboxing

    //Unboxing

    int unBoxing = number3.intValue();

    //dışarıdan veri alıp içeride veri türüne çevirirken kullanacagız.

}
