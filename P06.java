import java.util.Scanner;
import java.util.Random;

public class P06{
    public static void main(String[] args) {

        //Number guessing game

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1; // Random number from 1 to 100
        int guess;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("I have chosen a number between 1 and 100.");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
            }

        } while (guess != secretNumber);

        sc.close();
    }
}
