import java.util.Scanner;
class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double selling = sc.nextDouble();
        double profit = sc.nextDouble();
        double cost = (profit - selling) / 15;
        System.out.println("Each item cost: " + cost);
    }
}
