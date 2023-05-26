package cards;

import org.springframework.stereotype.Component;

@Component
public class MasterCard implements CreditCard{
    @Override
    public void getType() {
        System.out.println("Card Type is INTERNATIONAL.");
    }

    @Override
    public void makeTransaction(double amt) {
        double amount = amt-amt*0.1;
        double discount = amt-amount;
        System.out.println("Discounted Amount = "+amount+"/-");
        System.out.println("Congrats, Totat Discount you get is "+discount);
    }
}
