package BuilderDesignPattern;

import java.util.List;

public class Student {
    private final int id;
    private final String name;
    private final int age;
    private final String email;
    private final String address;
    private final String phoneNumber;
    List<String> subjects;

    Student(StudentBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
        this.subjects = builder.subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}

