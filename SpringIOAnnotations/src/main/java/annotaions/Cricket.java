package annotaions;

import org.springframework.stereotype.Component;

@Component
public class Cricket implements Sport{
    @Override
    public void getSportType() {
        System.out.println("Sport Type : Outdoor");
    }

    @Override
    public void getSportName() {
        System.out.println("Sport Name : Cricket");
    }
}
