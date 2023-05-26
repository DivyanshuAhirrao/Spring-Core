package beanLifecycle;

public class Burger {
    private double price;


    public Burger() {
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

    public void init() {
        System.out.println("Executing Init Method");
    }

    public void destroy() {
        System.out.println("Executing Destroy Method");
    }


}
