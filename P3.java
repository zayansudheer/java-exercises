import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Annual Interest Rate (%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        double amount = principal * Math.pow((1 + rate / 100), time);
        double compoundInterest = amount - principal;

        System.out.println("Total Amount = " + amount);
        System.out.println("Compound Interest = " + compoundInterest);

        sc.close();
    }
}