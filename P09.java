import java.util.Scanner;

public class P09 {
    public static void main(String[] args) {

        //Quiz game

        Scanner sc = new Scanner(System.in);

        String[] questions = {
                "What is the capital of India?",
                "Which language is used for Android development?",
                "How many bits are in a byte?",
                "Which company developed Java?"
        };

        String[][] options = {
                {"1. Mumbai", "2. New Delhi", "3. Kolkata", "4. Chennai"},
                {"1. Java", "2. Python", "3. PHP", "4. C"},
                {"1. 4", "2. 8", "3. 16", "4. 32"},
                {"1. Microsoft", "2. Apple", "3. Sun Microsystems", "4. Google"}
        };

        int[] answers = {2, 1, 2, 3};

        int score = 0;

        System.out.println("=== QUIZ GAME ===");

        for (int i = 0; i < questions.length; i++) {

            System.out.println("\nQuestion " + (i + 1));
            System.out.println(questions[i]);

            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer: ");
            int userAnswer = sc.nextInt();

            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }
        }

        System.out.println("\n=== QUIZ COMPLETED ===");
        System.out.println("Your Score: " + score + "/" + questions.length);

        sc.close();
    }
}