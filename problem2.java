import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter the distance between two cities in kilometers: ");
        double kilometers = sc.nextDouble();

      
        double meters = kilometers * 1000;
        double centimeters = kilometers * 100000;
        double feet = kilometers * 3280.84;
        double inches = kilometers * 39370.1;

      
        System.out.println("Distance in meters: " + meters);
        System.out.println("Distance in centimeters: " + centimeters);
        System.out.println("Distance in feet: " + feet);
        System.out.println("Distance in inches: " + inches);
    }
}
