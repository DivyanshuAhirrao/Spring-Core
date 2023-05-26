package shopdependency.mainentity;

import shopdependency.dependencyentity.Employee;
import shopdependency.dependencyentity.Product;

public class GroceryShop implements Shop{
    private Product p;
    private Employee e;

    public void setE(Employee e) {
        this.e = e;
    }

    public void setP(Product p) {
        this.p = p;
    }

    @Override
    public void getShopType() {
        System.out.println("----Welcome to DailyMart----");
        System.out.println();
    }

    @Override
    public void getProducts() {
        p.getType();
    }

    @Override
    public void getEmployee() {
        e.employeeType();
    }
}
