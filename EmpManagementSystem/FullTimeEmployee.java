package EmpManagementSystem;

public class FullTimeEmployee extends Employee{

    public double salary;
    public  static double totalFullTimeSalary = 0; // ✅ Total salary for full-time

    // constructor using super keyword
    public FullTimeEmployee( int id, String name, String department, double salary) {
        super(id, name, department);
        this.salary = salary;
        totalFullTimeSalary += this.salary; // Adding salary to total using this
    }

    @Override  // Override display method
    public void displayDetails(){
        super.displayDetails();
        System.out.println("EmpManagementSystem.Employee Type: Full-time");
        System.out.println("Salary: $" + salary);
        System.out.println("------------------------");
    }
}
