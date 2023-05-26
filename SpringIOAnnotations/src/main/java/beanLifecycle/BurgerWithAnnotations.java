package beanLifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BurgerWithAnnotations {
    private double price;


    public BurgerWithAnnotations() {
        System.out.println("creating Bean");
    }



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting Price");
        this.price = price;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "price=" + price +
                '}';
    }


    @PostConstruct
    public void init() {
        System.out.println("Executing Init Method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Executing Destroy Method");
    }

}
