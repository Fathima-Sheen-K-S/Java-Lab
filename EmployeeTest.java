import java.util.Scanner;

abstract class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Full-Time Employee
        System.out.print("Enter Full-Time Employee Name: ");
        String fullName = scanner.nextLine();
        System.out.print("Enter Employee ID: ");
        int fullId = scanner.nextInt();
        System.out.print("Enter Monthly Salary: ");
        double monthlySalary = scanner.nextDouble();
        FullTimeEmployee fullTimeEmp = new FullTimeEmployee(fullName, fullId, monthlySalary);

        // Input for Part-Time Employee
        scanner.nextLine(); 
        System.out.print("Enter Part-Time Employee Name: ");
        String partName = scanner.nextLine();
        System.out.print("Enter Employee ID: ");
        int partId = scanner.nextInt();
        System.out.print("Enter Hourly Rate: ");
        double hourlyRate = scanner.nextDouble();
        System.out.print("Enter Hours Worked: ");
        int hoursWorked = scanner.nextInt();
        PartTimeEmployee partTimeEmp = new PartTimeEmployee(partName, partId, hourlyRate, hoursWorked);
        System.out.println(fullTimeEmp.name + " (ID: " + fullTimeEmp.id + ") earns: " + fullTimeEmp.calculateSalary() + " per month");
        System.out.println(partTimeEmp.name + " (ID: " + partTimeEmp.id + ") earns: " + partTimeEmp.calculateSalary() + " per month");

        scanner.close();
    }
}
