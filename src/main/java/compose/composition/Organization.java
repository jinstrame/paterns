package compose.composition;

import java.util.ArrayList;
import java.util.List;

public class Organization {

    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        if (!employees.contains(employee)) {
            employees.add(employee);
        }
    }
    public boolean hasEmployee(Employee employee) {
        return employees.contains(employee);
    }

    public int getNetSalary() {
        return employees.stream().mapToInt(Employee::getSalary).sum();
    }

}
