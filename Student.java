import java.util.Scanner;

class Student {
    private int studentId;
    private String name;
    private double marks;

    public Student(int studentId, String name, double marks) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Pass Status: " + (isPassed() ? "Passed" : "Failed"));
        System.out.println();
    }

    public boolean isPassed() {
        return marks >= 40;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();

        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Marks: ");
            double marks = scanner.nextDouble();

            students[i] = new Student(id, name, marks);
        }

        System.out.println("\nStudent Details:");
        for (int i = 0; i < students.length; i++) {
            students[i].displayDetails();
        }
        

        scanner.close();
    }
}
