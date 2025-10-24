import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter Ramesh basic salary: ");
        double basicSalary = sc.nextDouble();

        
        double karchulu = 0.40 * basicSalary;
        double houserent = 0.20 * basicSalary;

      
        double grossSalary = basicSalary + karchulu + houserent;

        
        System.out.println("Gross Salary of Ramesh: " + grossSalary);
    }
}
