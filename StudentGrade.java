import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter your percentage: ");
        double percentage = scanner.nextDouble();

        char grade;
        String message;

       
        if (percentage >= 90) {
            grade = 'A';
            message = "Excellent work!";
        } else if (percentage >= 80) {
            grade = 'B';
            message = "Good job!";
        } else if (percentage >= 70) {
            grade = 'C';
            message = "You can do better.";
        } else if (percentage >= 60) {
            grade = 'D';
            message = "Work harder.";
        } else {
            grade = 'F';
            message = "Failed. Try again.";
        }

    
        System.out.println("\n===== Result =====");
        System.out.println("Grade: " + grade);
        System.out.println("Feedback: " + message);

        scanner.close();
    }
}
