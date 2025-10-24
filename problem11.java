import java.util.Scanner;

public class problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        int amount = sc.nextInt();
        int note100 = amount / 100;
        amount = amount % 100;
        int note50 = amount / 50;
        amount = amount % 50;
        int note10 = amount / 10;
        System.out.println("Currency Notes:");
        System.out.println("100 Rupee Notes: " + note100);
        System.out.println("50 Rupee Notes: " + note50);
        System.out.println("10 Rupee Notes: " + note10);
        
        
    }
}
