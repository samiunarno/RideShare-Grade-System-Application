import java.util.*;
public class GradeSystem {
    private List<User> users;
    private List<Student> students;
    private List<Teacher> teachers;
    private Scanner scanner;

    public GradeSystem(){
        this.users = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
        this.scanner = new Scanner(System.in);
        initializeDemoData();
    }

    private void initializeDemoData(){
        users.add(new User("student1", "12345", "student"));
        users.add(new User("teacher1", "11111", "teacher"));
        users.add(new User("admin", "12345", "admin"));

        Student s1 = new Student("S001", "Bushita");
        s1.addGrade("Advance Mathmatics", 90.0);
        s1.addGrade("Introduction to Computer", 98.0);
        s1.addGrade("Object Oriented Programming Language", 80.0);
        s1.addGrade("Introduction to Chineese", 96.0);
        students.add(s1);

        Student s2 = new Student("S002", "Mika");
        s2.addGrade("Advance Mathmatics", 90.0); 
        s2.addGrade("Introduction to Computer", 70.0);
        s2.addGrade("Object Oriented Programming Language", 60.0);
        s2.addGrade("Introduction to Chineese", 80.0);
        students.add(s2);

        Student s3 = new Student("S003", "Onot");
        s3.addGrade("Advance Mathmatics", 98.0); 
        s3.addGrade("Introduction to Computer", 80.0);
        s3.addGrade("Object Oriented Programming Language", 70.0);
        s3.addGrade("Introduction to Chineese", 90.0);
        students.add(s3);

        Student s4 = new Student("S004", "Emma");
        s4.addGrade("Advance Mathmatics", 80.0); 
        s4.addGrade("Introduction to Computer", 70.0);
        s4.addGrade("Object Oriented Programming Language", 60.0);
        s4.addGrade("Introduction to Chineese", 50.0);
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
        if(grade >= 70 && grade <= 100){
            return "A";
        }
        else if (grade >= 60 && grade < 70){ 
            return "B";
        }
        else if (grade >= 50 && grade < 60){ 
            return "C";
        }
        else if (grade >= 0 && grade < 50){
            return "F";
        }
        else {
            return "Invalid Grade";
        }
    }

    private void displayGradeWithLetters(Student student){
        System.out.println("\nGrades For " + student.getName() + "(" + student.getStudentId() + "):");
        System.out.println("Grade Conversion Example: ");
        System.out.println("85.5 --> " + convertToLetterGrade(85.5));
        System.out.println("65.0 --> " + convertToLetterGrade(65.0));
        System.out.println("55.0 --> " + convertToLetterGrade(55.0)); // Fixed: 55.0 instead of 55.5
        System.out.println("45.5 --> " + convertToLetterGrade(45.5));
    }

    private void gradeConversionChecker(){
        System.out.println("\nGrade Conversion Checker:");
        System.out.println("====================================");
        while (true) {
            System.out.print("\nEnter a Grade to Convert (0-100) or -1 to exit: ");
            try{
                double grade = scanner.nextDouble();
                scanner.nextLine();
                if(grade == -1){
                    break;
                }
                String letterGrade = convertToLetterGrade(grade);
                System.out.printf("%.1f -> %s%n", grade, letterGrade);
            } catch(Exception e){
                System.out.println("Please Enter a Valid Number");
                scanner.nextLine();
            }
        }
    }

    private void showGradeConversionRules(){
        System.out.println("\nGrade Conversion Rules:");
        System.out.println("===============================");
        System.out.println("70-100 : A");
        System.out.println("60-69 : B");
        System.out.println("50-59 : C");
        System.out.println("0-49 : F");
        System.out.println("Other -> Invalid Grade!");

        System.out.println("\nExamples:");
        double[] examples = {95.0, 85.0, 67.5, 55.0, 42.0, 30.0, 105.0, -5.0}; 
        for (double example : examples){
            System.out.printf("%.1f -> %s%n", example, convertToLetterGrade(example)); // Fixed: example instead of examples
        }
    }

    public User login() {
        System.out.println("=== Welcome to the Grade System ===");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        for (User user : users){
            if(user.login(username, password)){
                System.out.println("Login Successful! Welcome " + user.getRole());
                return user;
            }
        }
        System.out.println("Invalid Username or Password");
        return null;
    }

    public void studentMenu(Student student){
        while (true) {
            System.out.println("\nStudent Dashboard");
            System.out.println("1. View My Grades");
            System.out.println("2. Calculate Average Grades");
            System.out.println("3. View Grades with Letter Conversion");
            System.out.println("4. Grade Conversion Checker");
            System.out.println("5. Logout");
            System.out.print("Choose an Option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    student.ViewGrades();
                    break;
                case 2:
                    double avg = student.calculateAverage();
                    System.out.println("Your Average: " + String.format("%.2f", avg));
                    System.out.println("Letter Grade: " + convertToLetterGrade(avg));
                    break;
                case 3:
                    displayGradeWithLetters(student);
                    break;
                case 4:
                    gradeConversionChecker();
                    break;
                case 5:
                    System.out.println("Logging Out.. ");
                    return;
                default:
                    System.out.println("Invalid Choice Please Try Again");
            }
        }
    }

    public void teacherMenu(Teacher teacher){
        while (true) { 
            System.out.println("\nTeacher Dashboard");
            System.out.println("1. View All Students Grades");
            System.out.println("2. Add Grade to Student");
            System.out.println("3. Grade Conversion Rules");
            System.out.println("4. Grade Conversion Checker");
            System.out.println("5. Logout");
            System.out.print("Choose an Option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    if(!students.isEmpty()){
                        for (Student s : students) {
                            s.ViewGrades();
                        }
                        System.out.println("\nLetter Grade Reference:");
                        showGradeConversionRules();
                    }
                    break;
                case 2:
                    addGradeMenu(teacher);
                    break;
                case 3:
                    showGradeConversionRules();
                    break;
                case 4:
                    gradeConversionChecker();
                    break;
                case 5:
                    System.out.println("Logging Out");
                    return;
                default:
                    System.out.println("Invalid Choice Please Try Again");
            }
        }
    }

    private void addGradeMenu(Teacher teacher) {
        System.out.println("\nADD GRADE");
        if (students.isEmpty()) {
            System.out.println("No Students Available");
            return;
        }
        
        System.out.println("Available Students:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println((i + 1) + ". " + students.get(i).getName());
        }
        
        System.out.print("Select Student By Number: ");
        int studentChoice = scanner.nextInt();
        scanner.nextLine(); 
        
        if (studentChoice < 1 || studentChoice > students.size()) {
            System.out.println("Invalid Student Selection!");
            return;
        }
        
        Student selectedStudent = students.get(studentChoice - 1);
        System.out.print("Enter Subject name: ");
        String subjectName = scanner.nextLine();
        System.out.print("Enter Grade: ");
        double grade = scanner.nextDouble();
        scanner.nextLine(); 

        String letterGrade = convertToLetterGrade(grade);
        System.out.println("Grade Preview: " + grade + " -> " + letterGrade);
        selectedStudent.addGrade(subjectName, grade);
        
        System.out.println("Grade Added: " + grade + " (" + letterGrade + ") for " + selectedStudent.getName() + " in " + subjectName);
    }

    public void start() {
        System.out.println("=== Grade System Application ===");
        System.out.println("Letter Grade Conversion is Active");

        while (true) {
            User loggedInUser = login();
            if(loggedInUser == null) {
                continue;
            }
            
            if(loggedInUser.getRole().equals("student")){
                if(!students.isEmpty()){
                    Student student = null;
                    for (Student s : students) {
                        if (s.getName().toLowerCase().contains(loggedInUser.getUsername().toLowerCase()) || 
                            loggedInUser.getUsername().equals("student1")) {
                            student = s;
                            break;
                        }
                    }
                    if (student != null) {
                        studentMenu(student);
                    } else {
                        System.out.println("Student profile not found!");
                    }
                }
            } else if (loggedInUser.getRole().equals("teacher")){
                if(!teachers.isEmpty()){
                    teacherMenu(teachers.get(0));
                }
            }
            
            System.out.print("Do you want to close the Application? (yes/no): ");
            String exit = scanner.nextLine();
            if(exit.equalsIgnoreCase("yes") || exit.equalsIgnoreCase("y")){
                break;
            }
        }
        scanner.close();
        System.out.println("Thanks For Using Grade System Application....GoodBye");
    }

    public static void main(String[] args){
        GradeSystem system = new GradeSystem();
        system.start();
    }
}