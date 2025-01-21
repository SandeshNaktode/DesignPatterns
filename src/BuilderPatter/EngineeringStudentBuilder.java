package BuilderPatter;

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends  StudentBuilder{

    @Override
    public StudentBuilder setSubjects() {
        List<String> subs = new ArrayList<>();
        subs.add("CP");
        subs.add("DSA");
        subs.add("JAVA");
        subs.add("System Design");
        this.subjects = subs;
        return this;
    }
}
