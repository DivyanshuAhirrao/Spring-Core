package dependencyentity;

public class Diesel implements Fuel{
    @Override
    public void getFuelType() {
        System.out.println("Fuel Type is : Diesel");
    }
}
