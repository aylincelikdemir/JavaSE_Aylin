package week02.week04.interfaceexample;

public abstract class PalPayment implements PaymentMethod{

    private  String email;

    public PalPayment(String email){
        this.email=email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println( "PayPal paymet processed for amout");
    }
}
