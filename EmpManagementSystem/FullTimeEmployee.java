public class FullTimeEmployee extends Employee{

    public double salary;
    public FullTimeEmployee( int id, String name, String department, double salary) {
        super(id, name, department);
        this.salary = salary;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Employee Type: Full-time");
        System.out.println("Salary: $" + salary);
        System.out.println("------------------------");
    }
}
