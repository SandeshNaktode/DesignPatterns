package ProtoTypeDesignPattern;

public class ProtoTypeMain {
    public  static void main(String args []){
        System.out.println("----Student ProtoType-----");
        Student student = new Student("Sandesh", 25, 45);

        System.out.println(student + " ---- " + student.hashCode());

        Student studentClone = (Student) student.clone();

        System.out.println(studentClone + " ---- " + studentClone.hashCode());

        System.out.println("----Employee ProtoType-----");

        Employee employee = new Employee(45, "Pranjal Nagapure", 23, "HR", "HR Department");

        System.out.println(employee + " ---- " + employee.hashCode());

        Employee employeeClone = (Employee) employee.clone();

        System.out.println(employeeClone + " ---- " + employeeClone.hashCode());





    }
}
