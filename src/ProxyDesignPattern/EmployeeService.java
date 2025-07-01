package ProxyDesignPattern;

public interface EmployeeService {
    void createEmployee(String name);

    String readEmployee(int id);

    void updateEmployee(int id, String newName);

    void deleteEmployee(int id);
}

