import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth of the rectangle: ");
        double breadth = scanner.nextDouble();       
        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble(); 
        double rectangleArea = length * breadth;
        double rectanglePerimeter = 2 * (length + breadth);
        double circleArea = Math.PI * radius * radius;
        double circleCircumference = 2 * Math.PI * radius;
        System.out.println("\n\t--- Rectangle ---\t\t");
        System.out.println("Area: " + rectangleArea);
        System.out.println("Perimeter: " + rectanglePerimeter);
        System.out.println("\n\t--- Circle ---\t\t");
        System.out.println("Area: " + circleArea);
        System.out.println("Circumference: " + circleCircumference);
    }
}
