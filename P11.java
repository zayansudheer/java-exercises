import java.util.Scanner;
import java.util.Random;

public class P11 {
    public static void main(String[] args) {

        //Slot machine

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] symbols = {"CHERRY", "LEMON", "GRAPE", "STAR", "BELL"};

        double balance = 1000.0;
        String playAgain = "yes";

        System.out.println("=== SLOT MACHINE ===");

        do {

            System.out.println("\nCurrent Balance: ₹" + balance);

            System.out.print("Enter your bet amount: ₹");
            double bet = sc.nextDouble();

            if (bet <= 0 || bet > balance) {
                System.out.println("Invalid bet amount!");
                continue;
            }

            String slot1 = symbols[random.nextInt(symbols.length)];
            String slot2 = symbols[random.nextInt(symbols.length)];
            String slot3 = symbols[random.nextInt(symbols.length)];

            System.out.println("\nSpinning...");
            System.out.println("-----------------------------------");
            System.out.println("| " + slot1 + " | " + slot2 + " | " + slot3 + " |");
            System.out.println("-----------------------------------");

            if (slot1.equals(slot2) && slot2.equals(slot3)) {
                double winnings = bet * 5;
                balance += winnings;

                System.out.println("JACKPOT!");
                System.out.println("You won ₹" + winnings);
            }
            else if (slot1.equals(slot2) ||
                     slot1.equals(slot3) ||
                     slot2.equals(slot3)) {

                double winnings = bet * 2;
                balance += winnings;

                System.out.println("Two symbols matched!");
                System.out.println("You won ₹" + winnings);
            }
            else {
                balance -= bet;

                System.out.println("No match!");
                System.out.println("You lost ₹" + bet);
            }

            System.out.println("Current Balance: ₹" + balance);

            if (balance <= 0) {
                System.out.println("You are out of money!");
                break;
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
            playAgain = sc.next();

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("\nThanks for playing!");
        System.out.println("Final Balance: ₹" + balance);

        sc.close();
    }
}