package cards;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MainApp1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c1 = new ClassPathXmlApplicationContext("applicationcontext.xml");
        CreditCard master = c1.getBean("masterCard",CreditCard.class);
        CreditCard rupay = c1.getBean("rupay", CreditCard.class);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Country Name : ");
        String country = sc.next();

        if (country.equalsIgnoreCase("INDIA")) {
            System.out.println("Select Card for Payment :- ");
            System.out.println("1. MasterCard");
            System.out.println("2. Rupay");

            int ch = sc.nextInt();

            if (ch==1) {
                System.out.println("Enter the Amount");
                double amt = sc.nextDouble();
                master.getType();
                master.makeTransaction(amt);
            } else if (ch==2) {
                System.out.println("Enter the Amount");
                double amt = sc.nextDouble();
                rupay.getType();
                rupay.makeTransaction(amt);
            }
            else {
                System.out.println("Invalid Choice....");
            }
        }
        else {
            System.out.println("Select Card for Payment :- ");
            System.out.println("1. MasterCard");

            int ch = sc.nextInt();

            if (ch==1) {
                System.out.println("Enter the Amount");
                double amt = sc.nextDouble();
                master.getType();
                master.makeTransaction(amt);
            }
            else {
                System.out.println("Invalid Choice....");
            }

        }

    }
}
