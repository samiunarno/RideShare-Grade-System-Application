import java.util.*;
public class GradeSystem {
    private List<User>users;
    private List<Student>students;
    private List <Teacher> teachers;
    private Scanner scanner;

    public GradeSystem(){
        this.users = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
        this.scanner = new Scanner(System.in);
        initializeDemoData();
    }

    private void initializeDemoData(){
        users.add(new User("student1" , "12345", "student"));
        users.add(new User("teacher1" , "11111", "teacher"));
        users.add(new User("admin" , "12345", "admin"));

        Student s1 = new Student("S001", "Bushita");
        s1.addGrade("Advance Mathmatics",90.0);
        s1.addGrade("Introduction to Computer",90.0);
        s1.addGrade("Object Oriented Programming Language",90.0);
        s1.addGrade("Introduction to Chineese",90.0);
        students.add(s1);


        Student s2 = new Student("S002", "Mika");
        s1.addGrade("Advance Mathmatics",90.0);
        s1.addGrade("Introduction to Computer",90.0);
        s1.addGrade("Object Oriented Programming Language",90.0);
        s1.addGrade("Introduction to Chineese",90.0);
        students.add(s2);

        Student s3 = new Student("S003", "Onot");
        s1.addGrade("Advance Mathmatics",90.0);
        s1.addGrade("Introduction to Computer",90.0);
        s1.addGrade("Object Oriented Programming Language",90.0);
        s1.addGrade("Introduction to Chineese",90.0);
        students.add(s3);

        Student s4 = new Student("S004", "Emma");
        s1.addGrade("Advance Mathmatics",90.0);
        s1.addGrade("Introduction to Computer",90.0);
        s1.addGrade("Object Oriented Programming Language",90.0);
        s1.addGrade("Introduction to Chineese",90.0);
        students.add(s4);
    }

    Teacher t1 = new Teacher("T001", " Zhang Xie");
    t1.
    
}
