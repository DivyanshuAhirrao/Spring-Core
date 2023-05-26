package annotaions;

import org.springframework.stereotype.Component;

@Component
public class TableTennis implements Sport{
    @Override
    public void getSportType() {
        System.out.println("Sport Type : Indoor");
    }

    @Override
    public void getSportName() {
        System.out.println("Sport Name : TableTennis");
    }
}