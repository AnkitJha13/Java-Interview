public class PartTimeEmployee extends Employee{

    public int hoursWorked;
    public int hourlyRate;

    public PartTimeEmployee(int id, String name,  String department, int hoursWorked, int hourlyRate) {
        super(id, name, department);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculateCompensation(){
        return hoursWorked * hourlyRate;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Calls parent class method
        System.out.println("Employee Type: Part-time");
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Total Compensation: $" + calculateCompensation());
        System.out.println("------------------------");
    }
}
