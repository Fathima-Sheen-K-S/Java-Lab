
import java.util.Scanner;
class Rectangle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle : ");
        int l=scanner.nextInt();
        System.out.print("Enter the breadth of the rectangle : ");
        int b=scanner.nextInt();
        int area=l*b;
        int peri=2*(l+b);
        System.out.println("Area of Rectangle = "+area);
        System.out.print("Perimeter of Rectangle = "+peri);

    }
}
