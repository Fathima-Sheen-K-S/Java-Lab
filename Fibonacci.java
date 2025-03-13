import java.util.Scanner;

class Fibonacci{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();
        int f1 = 0, f2 = 1;
        System.out.print("Fibonacci Sequence up to " + limit + ": ");

        while (f1 <= limit) {
            System.out.print(f1 + " ");
            int f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }

        scanner.close();
    }
}
