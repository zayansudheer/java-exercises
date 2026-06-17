import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {

        //Age calculator

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Invalid age!");
        } else if (age <= 3) {
            System.out.println("You are a Toddler.");
        } else if (age <= 12) {
            System.out.println("You are a Kid.");
        } else if (age <= 19) {
            System.out.println("You are a Teenager.");
        } else if (age <= 35) {
            System.out.println("You are a Young Adult.");
        } else if (age <= 60) {
            System.out.println("You are an Adult.");
        } else {
            System.out.println("You are a Senior Citizen.");
        }

        sc.close();
    }
}
