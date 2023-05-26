package shopdependency.mainapp;

import mainentity.Car;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import shopdependency.mainentity.Shop;

public class MainApp1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c1 = new ClassPathXmlApplicationContext("applicationContext.xml");

        Shop s1 =c1.getBean("shop1", Shop.class);
        s1.getShopType();
        s1.getProducts();
        s1.getEmployee();

        System.out.println("----------------------------------");
        System.out.println();

        Shop s2 =c1.getBean("shop2", Shop.class);
        s2.getShopType();
        s2.getProducts();
        s1.getEmployee();


    }

}
