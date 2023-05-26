package shopdependency.dependencyentity;

public class HardwareItems implements Product{
    @Override
    public void getType() {
        System.out.println("--------Hardware Products-------");
        System.out.println("1. Pipe");
        System.out.println("2. Paints");
        System.out.println("3. Hammer");

    }
}
