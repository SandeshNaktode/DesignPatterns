package ProtoTypeDesignPattern;

public class Student implements ProtoType{
    private String name;
    private int age;
    private int rollNo;

    public Student(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    @Override
    public ProtoType clone() {
        return new Student(this.name, this.age, this.rollNo);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNo=" + rollNo +
                '}';
    }
}
