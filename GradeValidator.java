import java.util.Scanner;

class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}

public class GradeValidator {
    public static void validateGrade(char grade) throws InvalidGradeException {
        if (grade < 'A' || grade > 'F') {
            throw new InvalidGradeException("Invalid grade. Grade must be between 'A' and 'F'.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the student's grade (A-F): ");
        char grade = scanner.next().charAt(0);
        
        try {
            validateGrade(grade);
            System.out.println("Grade is valid.");
        } catch (InvalidGradeException e) {
            System.out.println("Invalid grade: " + e.getMessage());
        }
        
        scanner.close();
    }
}
 