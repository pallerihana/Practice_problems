import java.util.Scanner;
class problems8{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number = sc.nextInt();
        int res =0;
        if (number > 9999 && number <= 99999){
            while(number>0){
                 res = res*10+number%10;
                 number /=10;

            }
            System.out.println("Reverse Number : "+res);
        }else{
            System.out.println("Enter valid number...");
        }
        
    }
}