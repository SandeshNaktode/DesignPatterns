package BuilderPatter;

public class CollegeDirector {
    private StudentBuilder studentBuilder;

    public CollegeDirector(StudentBuilder builder) {
        this.studentBuilder = builder;
    }

    public Student createStudent(){
        if(studentBuilder instanceof EngineeringStudentBuilder){
            return createEngineeringStudent();
        } else{
            return createMBAStudent();
        }
    }

    private Student createMBAStudent() {
        return studentBuilder.setId(1).setName("Umashankar").setAge(24).setSubjects().build();
    }

    private Student createEngineeringStudent() {
        return studentBuilder.setId(2).setName("Sandesh").setEmail("abcd@snbhc.com").setAge(25).setSubjects().build();
    }
}
