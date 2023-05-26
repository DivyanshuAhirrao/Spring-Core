package dependencyentity;

public class Petrol implements Fuel{
    @Override
    public void getFuelType() {
        System.out.println("Fuel Type is : Petrol");
    }
}
