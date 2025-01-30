package srp;

public class Student {
    private String studentName;
    private int studentId;

    public Student(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public int getStudentId() {
        return this.studentId;
    }
}
