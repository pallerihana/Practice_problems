import java.util.Scanner;
class problem9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 999 && number <= 9999){
            int first_digit = number /1000;
            int last_digit = number %10;
            System.out.println("Sum of first and last digits is : "+(first_digit+last_digit));
        }
        else{
            System.out.println("Enter Valid number...");
        }
    }
}