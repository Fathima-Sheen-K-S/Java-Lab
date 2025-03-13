import java.util.Scanner;

public class CountVowCons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String text = scanner.nextLine().toLowerCase();
        int vowels = 0, consonants = 0;
        for (char ch : text.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                vowels++;
            } else if (Character.isLetter(ch)) {
                consonants++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        scanner.close();
    }
}
