import java.util.Scanner;

 class StrPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int length = str.length();
        int flag = 1; 

        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                flag = 0;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("The string "+str+" is a palindrome.");
        } else {
            System.out.println("The string "+str+" is not a palindrome.");
        }

        scanner.close();
    }
}
