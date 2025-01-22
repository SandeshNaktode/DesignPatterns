package ProtoTypeDesignPattern;

public class Employee implements ProtoType{

    private int empID;
    private String empName;
    private int empAge;
    private String empDesignation;
    private String empDepartment;

    public Employee(int empID, String empName, int empAge, String empDesignation, String empDepartment) {
        this.empID = empID;
        this.empName = empName;
        this.empAge = empAge;
        this.empDesignation = empDesignation;
        this.empDepartment = empDepartment;
    }


    @Override
    public ProtoType clone() {
        return new Employee(this.empID, this.empName, this.empAge, this.empDesignation, this.empDepartment);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", empName='" + empName + '\'' +
                ", empAge=" + empAge +
                ", empDesignation='" + empDesignation + '\'' +
                ", empDepartment='" + empDepartment + '\'' +
                '}';
    }
}
