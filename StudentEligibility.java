import java.util.Scanner;

class StudentEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Math marks: ");
        int math = scanner.nextInt();

        System.out.print("Enter Physics marks: ");
        int physics = scanner.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chemistry = scanner.nextInt();
        int totalMarks = math + physics + chemistry;
        int mathPhysicsTotal = math + physics;

        if (totalMarks >= 150 || mathPhysicsTotal >= 100) {
            System.out.println("The student is eligible!");
        } else {
            System.out.println("The student is NOT eligible.");
        }

    }
}
