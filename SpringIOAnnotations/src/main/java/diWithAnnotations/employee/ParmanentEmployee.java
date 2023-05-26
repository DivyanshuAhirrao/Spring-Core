package diWithAnnotations.employee;

import org.springframework.stereotype.Component;

@Component("permanent")
public class ParmanentEmployee implements Employee{
    @Override
    public void getType() {
        System.out.println("Employee Type is parmanent based...");
    }
}
