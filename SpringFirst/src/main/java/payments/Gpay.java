package payments;

public class Gpay implements UPI {
    @Override
    public void makePayment(double amt) {
        double famt = amt-amt*0.005;
        System.out.println("Final Amout is : "+famt);
        System.out.println("You get Cashback of Rs"+amt*0.005);
    }
}
