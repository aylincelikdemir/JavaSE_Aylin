package week02.week04.enums;

public class Test {

    Size pizzaSize;

    public Test(Size pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public void  orderPizza(){
        switch (pizzaSize){
            case SMALL :{
                System.out.println( "I ordered a small size pizza");
                break;
            }
            case LARGE:{
                System.out.println( "I ordered a Large size pizza");
                break;
            }
            case MEDIUM:{
                System.out.println( "I ordered a Medium  size pizza");
                break;
            }
            case EXTRALARGE:{
                System.out.println( "I ordered a Extralarge size pizza");
                break;
            }
            default:{
                System.out.println( "I dont know which size to order.");
                break;
            }
        }
    }

    public static void main(String[] args) {

    }
}
