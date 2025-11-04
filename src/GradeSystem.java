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

        Teacher t1 = new Teacher("T001", "Wu Xiulan");
        t1.addSubject("Advance Mathmatics");
        teachers.add(t1);

        Teacher t2 = new Teacher("T002", "Yan Fei");
        t2.addSubject("Introduction to Computer");
        teachers.add(t2);

        Teacher t3 = new Teacher("T003", "Zhao Haonan");
        t3.addSubject("Object Oriented Programming Language");
        teachers.add(t3);

        Teacher t4 = new Teacher("T004", "XU YI");
        t4.addSubject("Introduction to Chineese");
        teachers.add(t4);
    }

    private String convertToLetterGrade(double grade){
        if(grade>= 70 && grade <=100){
            return "A";
        }
        else if (grade >60 && grade < 69){
            return "B";
        }
        else if (grade >=50 && grade <= 59 ){
            return "C";
        }
        else if (grade >=0 && grade <=40){
            return "F";
        }
        else {
            return "Invalid Grade";
        }
    }
    private void displayGradeWithLetters(Student student){
        System.out.println("\n Grades For " + student.getName() + "(" + student.getStudentId() + ") :");
        System.out.println("Grade Conversion Example : ");
        System.out.println("85.5 -->" + convertToLetterGrade(85.5)+ "");
        System.out.println("65.0 -->" + convertToLetterGrade(65.0) + "");
        System.out.println("55.0 -->" + convertToLetterGrade(55.5) + "");
        System.out.println("45.5 -->" + convertToLetterGrade(45.5) + "");
    }

    
    
}
