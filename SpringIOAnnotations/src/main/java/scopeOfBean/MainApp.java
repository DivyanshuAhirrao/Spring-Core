package scopeOfBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationcontext.xml");
        Demo d1 = app.getBean(Demo.class);
        Demo d2  = app.getBean(Demo.class);
        Demo d3  = app.getBean(Demo.class);

        d2.setPrice(849);
        d3.setPrice(499);
        System.out.println(d1.getPrice());
        System.out.println(d2.getPrice());
        System.out.println(d3.getPrice());

    }
}
