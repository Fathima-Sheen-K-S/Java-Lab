import java.util.Scanner;

public class EmployeesSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Designation (Manager/Developer/Intern): ");
        String designation = scanner.nextLine().toLowerCase();

      
        System.out.print("Enter Years of Experience: ");
        int experience = scanner.nextInt();

        double salary = 0;
        double bonus = 0;

 
        switch (designation) {
            case "manager":
                salary = 50000;
                break;
            case "developer":
                salary = 30000;
                break;
            case "intern":
                salary = 15000;
                break;
            default:
                System.out.println("Invalid Designation!");
                return; 
        }

     
        if (experience >= 3 && experience <= 5) {
            bonus = 0.10 * salary; 
        } else if (experience > 5) {
            bonus = 0.20 * salary; 
        }

        double totalSalary = salary + bonus;

        
        System.out.println("\n===== Salary Details =====");
        System.out.println("Base Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);

        scanner.close();
    }
}
