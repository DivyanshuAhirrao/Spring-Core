package cards;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MainApp2 {
    static CreditCard master;
    static CreditCard rupay;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c1 = new ClassPathXmlApplicationContext("applicationcontext.xml");
         master = c1.getBean("masterCard",CreditCard.class);
         rupay = c1.getBean("rupay", CreditCard.class);

        String[] countries = {"India", "Nepal", "Bhutan", "Singapore"};

        System.out.println("Enter the Country Name : ");
        String country = sc.next();
        boolean flag = true;

        for (int i=0;i<countries.length;i++) {


            if (country.equalsIgnoreCase(countries[i])) {
                System.out.println("Select Card for Payment :- ");
                System.out.println("1. MasterCard");
                System.out.println("2. Rupay");

                int ch = sc.nextInt();

                if (ch==1) {
                    MainApp2.master();
                    break;
                } else if (ch==2) {
                    MainApp2.rupay();
                    break;
                }
                else {
                    System.out.println("Invalid Choice....");
                }
                    break;
            }
            else {
                flag = false;
            }
            
        }
    }
       public void secondChoice() {
            System.out.println("Select Card for Payment :- ");
            System.out.println("1. MasterCard");

            int ch = sc.nextInt();

            if (ch == 1) {
                MainApp2.master();
            } else {
                System.out.println("Invalid Choice....");
            }

        }


    public static void master() {
        System.out.println("Enter the Amount");
        double amt = sc.nextDouble();
        master.getType();
        master.makeTransaction(amt);
    }
    public static void rupay() {
        System.out.println("Enter the Amount");
        double amt = sc.nextDouble();
        master.getType();
        master.makeTransaction(amt);
    }
}






