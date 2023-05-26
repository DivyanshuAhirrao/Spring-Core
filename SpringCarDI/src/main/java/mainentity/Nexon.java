package mainentity;

import dependencyentity.Fuel;

public class Nexon implements Car{
    private Fuel n;

    // Constructor Injection :
    public Nexon(Fuel n) {
        this.n = n;
    }

    @Override
    public void getCompany() {
        System.out.println("Company Name is Tata");
    }

    @Override
    public void getFuel() {
        n.getFuelType();
    }
}
