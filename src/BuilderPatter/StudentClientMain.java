package BuilderPatter;

public class StudentClientMain {
    public static void main(String[] args) {
        CollegeDirector director = new CollegeDirector(new EngineeringStudentBuilder());
        CollegeDirector director2 = new CollegeDirector(new MBAStudentBuilder());


        Student enggStudent = director.createStudent();

        Student mbaStudent = director2.createStudent();

        System.out.println(enggStudent);
        System.out.println(mbaStudent);
    }
}

