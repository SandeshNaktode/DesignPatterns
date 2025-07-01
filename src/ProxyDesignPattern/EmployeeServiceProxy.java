package ProxyDesignPattern;

public class EmployeeServiceProxy implements EmployeeService {
    private static EmployeeServiceImpl realService = new EmployeeServiceImpl();
    private String currentUserRole;

    public EmployeeServiceProxy(String role) {
        this.currentUserRole = role;
        //this.realService = new EmployeeServiceImpl();
    }

    @Override
    public void createEmployee(String name) {
        if ("ADMIN".equals(currentUserRole)) {
            realService.createEmployee(name);
        } else {
            System.out.println("Access Denied: Only ADMIN can create employees.");
        }
    }

    @Override
    public String readEmployee(int id) {
        return realService.readEmployee(id); // Everyone can read
    }

    @Override
    public void updateEmployee(int id, String newName) {
        if ("ADMIN".equals(currentUserRole)) {
            realService.updateEmployee(id, newName);
        } else {
            System.out.println("Access Denied: Only ADMIN can update employees.");
        }
    }

    @Override
    public void deleteEmployee(int id) {
        if ("ADMIN".equals(currentUserRole)) {
            realService.deleteEmployee(id);
        } else {
            System.out.println("Access Denied: Only ADMIN can delete employees.");
        }
    }
}
