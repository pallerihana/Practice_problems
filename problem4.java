import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double centigrade = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in Centigrade: " + centigrade);
    }
}
