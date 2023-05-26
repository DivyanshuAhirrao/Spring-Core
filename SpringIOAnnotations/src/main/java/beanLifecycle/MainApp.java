package beanLifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");

        Burger b1 = context.getBean(Burger.class);
        System.out.println(b1);

        context.registerShutdownHook();
    }
}
