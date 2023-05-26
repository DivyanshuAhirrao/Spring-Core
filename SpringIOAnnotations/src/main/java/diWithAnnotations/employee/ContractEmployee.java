package diWithAnnotations.employee;

import diWithAnnotations.company.Company;
import org.springframework.stereotype.Component;

@Component("contract")
public class ContractEmployee implements Employee{
    @Override
    public void getType() {
        System.out.println("Employee Type is Contract based...");
    }
}
