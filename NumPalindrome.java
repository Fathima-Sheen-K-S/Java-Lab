import java.util.Scanner;

class NumPalindrome{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rev=0;
        System.out.print("Enter the number : ");
        int num=scanner.nextInt();
        int numo=num;
        while(num!=0){
            int rem=num%10;
            rev=(rev*10)+rem;
            num = num/10;

        }
       if(rev == numo){
        System.out.print("The number "+numo+" is a palindrome with reverse "+rev);
       }
       else{
        System.out.print("The number "+numo+" is a not palindrome with reverse "+rev);
       }

    }
}