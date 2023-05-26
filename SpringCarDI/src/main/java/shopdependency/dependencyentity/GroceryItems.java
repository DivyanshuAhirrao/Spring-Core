package shopdependency.dependencyentity;

public class GroceryItems implements Product{
    @Override
    public void getType() {
        System.out.println("--------Grocery Products-------");
        System.out.println("1. Aata");
        System.out.println("2. Vegetabls");
        System.out.println("3. Fruits");

    }
}
