import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C, D;
        System.out.print("Enter value of C: ");
        C = sc.nextInt();
        System.out.print("Enter value of D: ");
        D = sc.nextInt(); 
        int temp = C;
        C = D;
        D = temp;
        System.out.println("After swapping:");
        System.out.println("C = " + C);
        System.out.println("D = " + D);
    }
}
