package ProxyDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class EmployeeServiceImpl implements EmployeeService {
    private Map<Integer, String> employeeDB = new HashMap<>();
    private int counter = 1;

    @Override
    public void createEmployee(String name) {
        employeeDB.put(counter++, name);
        System.out.println("Employee created: " + name);
    }

    @Override
    public String readEmployee(int id) {
        return employeeDB.getOrDefault(id, "Employee not found");
    }

    @Override
    public void updateEmployee(int id, String newName) {
        if (employeeDB.containsKey(id)) {
            employeeDB.put(id, newName);
            System.out.println("Employee updated to: " + newName);
        } else {
            System.out.println("Employee not found");
        }
    }

    @Override
    public void deleteEmployee(int id) {
        if (employeeDB.remove(id) != null) {
            System.out.println("Employee deleted");
        } else {
            System.out.println("Employee not found");
        }
    }
}
