import java.util.*;

public class Teacher {
    private String teacherId;
    private String name;
    private List<String> subjects;

    public Teacher(String teacherId, String name){
        this.teacherId = teacherId;
        this.name = name;
        this.subjects = new ArrayList<>();
    }
    public void addSubject(String subject){
        subjects.add(subject);
    }

    public void addGradetoStudent(Student student, String subject, double grade){
        if(!subjects.contains(subject)){
            System.out.println("You have no permission" + subject);
            return;
        }
        if(grade<0 || grade>100){
            System.out.println("Grade Must be 0 to 100");
            return;
        }
        student.addGrade(subject, grade);
        System.out.println("Grade : " + grade + "added to" +student.getName()+ " For" + subject);

    }

    public void viewallGrades(List<Student>students){
        System.out.println("\n Teacher : "+ name);
        System.out.println("All Student Grades :");
        System.out.println("==========================");

        for(Student student : students){
            System.out.println("\nStudent: " + student.getName()+ "(" + student.getStudentId() + ")");
            Map<String,Double>studentGrades = getStudentGrades(student);
            if(studentGrades.isEmpty()){
                System.out.println("No Grades Available.");
            }
            else {
                for (Map.Entry<String, Double>entry : studentGrades.entrySet()){
                    System.out.println(" " + entry.getKey()+ " :" + entry.getValue());
                }
            }
        }
    }
    private Map<String, Double>getStudentGrades(Student student){
        return new HashMap<>();
    }
    public String getTeacherId(){
        return teacherId;
    }
    public String getName(){
        return name;
    }
    
}
