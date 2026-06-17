import java.util.Random;

public class P08 {
    public static void main(String[] args) {
        Random random = new Random();

        int dice = random.nextInt(6) + 1;

        System.out.println("You rolled: " + dice);
        System.out.println();

        switch (dice) {
            case 1:
                System.out.println(" ----- ");
                System.out.println("|     |");
                System.out.println("|  *  |");
                System.out.println("|     |");
                System.out.println(" ----- ");
                break;

            case 2:
                System.out.println(" ----- ");
                System.out.println("|*    |");
                System.out.println("|     |");
                System.out.println("|    *|");
                System.out.println(" ----- ");
                break;

            case 3:
                System.out.println(" ----- ");
                System.out.println("|*    |");
                System.out.println("|  *  |");
                System.out.println("|    *|");
                System.out.println(" ----- ");
                break;

            case 4:
                System.out.println(" ----- ");
                System.out.println("|*   *|");
                System.out.println("|     |");
                System.out.println("|*   *|");
                System.out.println(" ----- ");
                break;

            case 5:
                System.out.println(" ----- ");
                System.out.println("|*   *|");
                System.out.println("|  *  |");
                System.out.println("|*   *|");
                System.out.println(" ----- ");
                break;

            case 6:
                System.out.println(" ----- ");
                System.out.println("|*   *|");
                System.out.println("|*   *|");
                System.out.println("|*   *|");
                System.out.println(" ----- ");
                break;
        }
    }
}