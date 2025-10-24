import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a five-digit number: ");
        int number = sc.nextInt();

        
        int sum = 0 , res =0;
        while(number>0){
            res = number%10;
            sum+=res;
            number /=10;

        }
       
        System.out.println("Sum of digits: " + sum);
    }
}
