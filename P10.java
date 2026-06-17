import java.util.Scanner;
import java.util.Random;

public class P10 {
    public static void main(String[] args) {

        // Rock,Paper,Scissor

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String playAgain;

        do {
            System.out.println("\n=== Rock Paper Scissors ===");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.print("Enter your choice (1-3): ");

            int userChoice = sc.nextInt();

            int computerChoice = random.nextInt(3) + 1;

            System.out.println("\nComputer chose: " + computerChoice);

            if (userChoice == computerChoice) {
                System.out.println("It's a Draw!");
            }
            else if ((userChoice == 1 && computerChoice == 3) ||
                     (userChoice == 2 && computerChoice == 1) ||
                     (userChoice == 3 && computerChoice == 2)) {
                System.out.println("You Win!");
            }
            else {
                System.out.println("Computer Wins!");
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
            playAgain = sc.next();

        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing!");
        sc.close();
    }
}