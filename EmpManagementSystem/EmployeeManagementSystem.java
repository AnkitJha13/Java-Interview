public class EmployeeManagementSystem {

    public static void displayFullTimeEmployees(FullTimeEmployee[] fullTimeEmployees){
        System.out.println("=== Full-Time Employee Details ===");
        for(FullTimeEmployee ft : fullTimeEmployees){
            ft.displayDetails();
        }
    }

    public static void displayPartTimeEmployees(PartTimeEmployee[] partTimeEmployees){
        System.out.println("=== Full-Time Employee Details ===");
        for(PartTimeEmployee pt : partTimeEmployees){
            pt.displayDetails();
        }
    }

    public static void main(String[] args) {

        FullTimeEmployee[] fullTimeEmployees = new FullTimeEmployee[2];
        PartTimeEmployee[] partTimeEmployees = new PartTimeEmployee[2];

        fullTimeEmployees[0] = new FullTimeEmployee(101, "Athena", "Developer", 12500.0);
        fullTimeEmployees[1] = new FullTimeEmployee(102, "John", "HR", 15000.0);


        partTimeEmployees[0] = new PartTimeEmployee(201, "Mamba", "DevOps", 2, 300);
        partTimeEmployees[1] = new PartTimeEmployee(202, "Jane", "Support", 4, 250);


        displayFullTimeEmployees(fullTimeEmployees);
        displayPartTimeEmployees(partTimeEmployees);


    }

}



// Output

=== Full-Time Employee Details ===
ID: 101
Name: Athena
Department: Developer
Employee Type: Full-time
Salary: $12500.0
------------------------
ID: 102
Name: John
Department: HR
Employee Type: Full-time
Salary: $15000.0
------------------------
=== Full-Time Employee Details ===
ID: 201
Name: Mamba
Department: DevOps
Employee Type: Part-time
Hours Worked: 2
Hourly Rate: $300
Total Compensation: $600.0
------------------------
ID: 202
Name: Jane
Department: Support
Employee Type: Part-time
Hours Worked: 4
Hourly Rate: $250
Total Compensation: $1000.0
------------------------
