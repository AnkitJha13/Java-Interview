package EmpManagementSystem;

public class Employee {

    public int id;
    public String name;
    public String department;
    public static int totalEmployees;



    public Employee(int id, String name,  String department) {

        this.id = id;
        this.name = name;
        this.department = department;
        totalEmployees++;
    }

    public void displayDetails(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}
