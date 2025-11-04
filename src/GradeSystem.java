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

    private void gradeConversionChecker(){
        System.out.println("\n Grade Conversion Checker :");
        System.out.print("====================================");
        while (true) {
            System.out.print("\n Enter a Grade to Convert (0-100) or -1 to exit :");
            try{
                double grade = scanner.nextDouble();
                scanner.nextLine();
                if(grade == -1){
                    break;
                }
                String letterGrade = convertToLetterGrade(grade);
                System.out.printf("%.1f -> %s%n", grade,letterGrade);
            }catch(Exception e){
                System.out.println("Please Enter a Valid Number");
                scanner.nextLine();
            }
            
        }
    }
    private void showGradeConversionRules(){
        System.out.println("\n Grade Conversion Rules :");
        System.out.println("===============================");
        System.out.println("70-100 : A");
        System.out.println("60-69 : B");
        System.out.println("50-59 : C");
        System.out.println("0-49 : F");
        System.out.println("Other -> Input Please Error !");

        System.out.print("\n Examples :");
        double[] example = { 95.0,85.0,67.5,55.0,42.0,30.0,105.0,-5.0};
        for (double Examples : example){
            System.out.printf("%.1f -> %s%n", example, convertToLetterGrade(Examples));
        }
    }
    public User login () {
        System.out.println("=== Welcome to the Grade System ===");
        System.out.println("Username :");
        String username = scanner.nextLine();
        System.out.println("Password");
        String password = scanner.nextLine();
    }

    
    
}
