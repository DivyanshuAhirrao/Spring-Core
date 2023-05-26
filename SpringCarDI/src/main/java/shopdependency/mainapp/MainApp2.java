package shopdependency.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import shopdependency.mainentity.Shop;

import java.util.Scanner;

public class MainApp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ClassPathXmlApplicationContext c1 = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("Heyy User, What you want to shop today :- ");
        System.out.println();
        System.out.println("1. Grocery");
        System.out.println("2. Hardware");

        int ch = sc.nextInt();
        if (ch==1) {
            Shop s1 =c1.getBean("shop1", Shop.class);
            s1.getShopType();
            s1.getProducts();
        } else if (ch == 2) {
            Shop s2 =c1.getBean("shop2", Shop.class);
            s2.getShopType();
            s2.getProducts();
        }
        else {
            System.out.println("Invalid Credential...");
        }

    }
}
