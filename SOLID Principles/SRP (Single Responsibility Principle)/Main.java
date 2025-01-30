package srp;

public class Main {
    public static void main(String[] args) {
        // Creating a student object
        Student student = new Student("John Doe", 101);

        // Creating separate services for student management and notifications
        StudentManager studentManager = new StudentManager();
        NotificationService notificationService = new NotificationService();

        // Adding the student and sending a notification
        studentManager.addStudent(student);
        notificationService.sendNotification("Student has been successfully added.");

        // Displaying student details
        studentManager.getStudentDetails(student);
    }
}


// Output

// Student added: John Doe
// Notification: Student has been successfully added.
// Student ID: 101, Name: John Doe

