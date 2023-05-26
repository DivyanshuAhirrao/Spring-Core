package diWithAnnotations.company;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext c1 = new ClassPathXmlApplicationContext("applicationcontext.xml");

        Company service = c1.getBean("company1", Company.class);
        service.getType();
        service.getEmployee();
        service.getBuilding();

        System.out.println();
        System.out.println("--------------------");
        System.out.println();

        Company product = c1.getBean("company2", Company.class);
        product.getType();
        product.getEmployee();
        product.getBuilding();





    }
}
