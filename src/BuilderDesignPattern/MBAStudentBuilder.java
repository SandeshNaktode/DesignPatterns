package BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        List<String> subs = new ArrayList<>();
        subs.add("Bussiness Studies");
        subs.add("Management");
        subs.add("Finance");
        subs.add("Marketing");
        this.subjects = subs;
        return this;
    }
}
