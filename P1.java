import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        
        //Shopping cart program

        Scanner scanner = new Scanner(System.in);

        String item;
        double price,total;
        int quantity;
        char currency = '$';

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();

        total = price*quantity;
    
        System.out.println("You have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + total);


        scanner.close();
    }
}
