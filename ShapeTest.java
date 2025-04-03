import java.util.Scanner;

interface Shape {
    double calculateArea();
}

class Triangle implements Shape {
    private double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

class Rectangle implements Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    
    public double calculateArea() {
        return length * width;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter height of the triangle: ");
        double height = scanner.nextDouble();
        Shape triangle = new Triangle(base, height);
        
        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double width = scanner.nextDouble();
        Shape rectangle = new Rectangle(length, width);
        
        System.out.println("\nArea of Triangle: " + triangle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        
        scanner.close();
    }
}
