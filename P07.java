import java.util.Scanner;

public class P07 {
    public static void main(String[] args) {

        //Bankking program1

        Scanner sc = new Scanner(System.in);

        double balance = 1000.0;
        int choice;

        while (true) {
            System.out.println("\n=== Simple Banking System ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    double deposit = sc.nextDouble();
                    balance = balance + deposit;
                    System.out.println("Deposit successful!");
                    System.out.println("New balance: ₹" + balance);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= balance) {
                        balance = balance - withdraw;
                        System.out.println("Withdrawal successful!");
                        System.out.println("Remaining balance: ₹" + balance);
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using our bank!");
                    sc.close();
                    return; // Ends the program

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}