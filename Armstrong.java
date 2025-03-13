import java.util.Scanner;

class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNum = number, sum = 0, digits = 0;

        // Counting the number of digits
        while (number > 0) {
            number=number/10;
            digits++;
        }

        number=originalNum;
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number =number/10;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
