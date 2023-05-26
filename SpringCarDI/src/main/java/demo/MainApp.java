package demo;

import mainentity.Car;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c1 = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car r1 =c1.getBean("car1", Car.class);
        r1.getCompany();
        r1.getFuel();
        System.out.println("----------------------------------");
        Car r2 =c1.getBean("car2", Car.class);
        r2.getCompany();
        r2.getFuel();


    }
}
