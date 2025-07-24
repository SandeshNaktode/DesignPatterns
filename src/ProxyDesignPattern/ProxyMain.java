package ProxyDesignPattern;

public class ProxyMain {
    public static void main(String[] args) {
        EmployeeService adminProxy = new EmployeeServiceProxy("ADMIN");
        adminProxy.createEmployee("Sandesh");
        adminProxy.updateEmployee(1, "Sandesh Naktode");
        System.out.println(adminProxy.readEmployee(1));
        adminProxy.deleteEmployee(1);
        //System.out.println(adminProxy.readEmployee(1));

        EmployeeService userProxy = new EmployeeServiceProxy("USER");
        userProxy.createEmployee("Param"); //Access Denied
        System.out.println(userProxy.readEmployee(1)); // Still allowed
    }
}
