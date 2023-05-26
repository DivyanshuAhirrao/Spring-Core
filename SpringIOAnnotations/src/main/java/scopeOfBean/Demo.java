package scopeOfBean;

public class Demo {
    private double price;


    public Demo() {
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
        return "Prod-Price{" +
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
