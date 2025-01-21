package BuilderPatter;

import java.util.ArrayList;
import java.util.List;

public abstract class StudentBuilder {
    int id;
    String name;
    int age;
    String email;
    String address;
    String phoneNumber;
    protected List<String> subjects;

    // Required fields
    public StudentBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    // Optional fields
    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public StudentBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public StudentBuilder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public abstract StudentBuilder setSubjects();

    // Build method
    public Student build() {
        return new Student(this);
    }
}
