import java.util.Scanner;
class RectangleClass {
    private double length;
    private double width;

    // Default constructor
    public RectangleClass() {
        this.length = 1.0;
        this.width = 1.0;
    }
//parameterised constructor
    public RectangleClass(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public void display() {
        System.out.println("Rectangle - Length: " + length + ", Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        RectangleClass rect1 = new RectangleClass(); // Default constructor
        System.out.println("Enter the length of the rectangle:");
        double l=scanner.nextDouble();
        System.out.println("Enter the breadth of the rectangle:");
        double b=scanner.nextDouble();
        RectangleClass rect2 = new RectangleClass(l,b); // Parameterized constructor
           
        rect1.display();
        rect2.display();
        
    }
}
