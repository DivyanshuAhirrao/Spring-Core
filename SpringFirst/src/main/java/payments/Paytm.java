package payments;

public class Paytm implements UPI{
    @Override
    public void makePayment(double amt) {
        double famt = amt-amt*0.01;
        System.out.println("Final Amount is : "+famt);
        System.out.println("You Get Cash Back of RS"+amt*0.01);
    }
}
