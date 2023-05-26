package payments;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c1 = new ClassPathXmlApplicationContext("applicationContext.xml");
        UPI p1 = c1.getBean("u1", UPI.class);
        UPI p2 = c1.getBean("u2", UPI.class);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to Pay");
        double amount = sc.nextDouble();

        System.out.println("1. Pay by Gpay");
        System.out.println("2. Pay by Paytm");

        int choice = sc.nextInt();
        if (choice == 1) {
            p1.makePayment(amount);
        } else if (choice == 2) {
            p2.makePayment(amount);
        }
        else {
            System.out.println("Invalid Option");
        }

    }
}
