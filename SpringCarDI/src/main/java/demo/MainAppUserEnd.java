package demo;

import mainentity.Car;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MainAppUserEnd {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c1 = new ClassPathXmlApplicationContext("applicationContext.xml");

        Car r1 =c1.getBean("car1", Car.class);
        Car r2 =c1.getBean("car2", Car.class);
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the Car you Want to Purchase :- ");
        System.out.println("------------------------------------------");

        System.out.println("1. Nexon");
        System.out.println("2. Fortuner");

        int ch = sc.nextInt();

        if (ch == 1) {
            r1.getCompany();

            System.out.println("Select the Fuel Type :- ");
            System.out.println("------------------------------------------");

            System.out.println("1. Petrol");
            System.out.println("2. Diesel");

            int ch1 = sc.nextInt();

            if (ch1 == 1) {
                System.out.println("--------------------------------------------");
                System.out.println();
                System.out.println("Your Final Choice is : ");
                r1.getCompany();
                r1.getFuel();
            } else if (ch1 == 2) {
                System.out.println("--------------------------------------------");
                System.out.println();
                System.out.println("Your Final Choice is : ");
                r1.getCompany();
                r2.getFuel();
            }
            else {
                System.out.println("Invalid Choice....");
            }
        } else if (ch == 2) {
            r2.getCompany();

            System.out.println("Select the Fuel Type :- ");
            System.out.println("------------------------------------------");

            System.out.println("1. Petrol");
            System.out.println("2. Diesel");

            int ch1 = sc.nextInt();

            if (ch1 == 1) {
                r1.getFuel();
            } else if (ch1 == 2) {
                r2.getFuel();
            }
            else {
                System.out.println("Invalid Choice....");
            }
        } else {
            System.out.println("Invalid Choice....");
        }


    }
}
