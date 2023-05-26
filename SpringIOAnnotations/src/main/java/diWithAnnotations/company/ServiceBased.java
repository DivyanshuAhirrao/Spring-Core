package diWithAnnotations.company;

import diWithAnnotations.buildings.Building;
import diWithAnnotations.employee.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("company1")
public class ServiceBased implements Company{
    @Autowired
    @Qualifier("permanent")
    private Employee employee;

    private Building building;

    public ServiceBased(@Qualifier("comm") Building building) {
        this.building = building;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void getType() {
        System.out.println("Company Type is Service Base.");
    }

    @Override
    public void getEmployee() {
        employee.getType();
    }

    @Override
    public void getBuilding() {
        building.getType();
    }
}
