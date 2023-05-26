package mainentity;

import dependencyentity.Fuel;

public class Fortuner implements Car{

    private Fuel f;

    // Constructor Injection :-
    public Fortuner(Fuel f) {
        this.f = f;
    }

    @Override
    public void getCompany() {
        System.out.println("Company Name is Toyota");
    }

    @Override
    public void getFuel() {
        f.getFuelType();
    }
}
