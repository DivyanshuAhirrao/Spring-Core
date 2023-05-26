package beanLifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppAnnotaions {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");

        BurgerWithAnnotations b1 = context.getBean(BurgerWithAnnotations.class);
        System.out.println(b1);

        context.registerShutdownHook();
    }
}
