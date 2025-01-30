package srp;

public class StudentManager {
    public void addStudent(Student student) {
        System.out.println("Student added: " + student.getStudentName());
    }

    public void getStudentDetails(Student student) {
        System.out.println("Student ID: " + student.getStudentId() + ", Name: " + student.getStudentName());
    }
}
