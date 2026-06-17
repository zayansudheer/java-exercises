import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {

        //Weight conversion

        Scanner sc = new Scanner(System.in);

        System.out.println("Weight Converter");
        System.out.println("1. Kilograms to Pounds");
        System.out.println("2. Pounds to Kilograms");
        System.out.print("Choose an option (1 or 2): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter weight in kilograms: ");
            double kg = sc.nextDouble();
            double pounds = kg * 2.20462;
            System.out.println("Weight in pounds = " + pounds + " lbs");
        } 
        else if (choice == 2) {
            System.out.print("Enter weight in pounds: ");
            double pounds = sc.nextDouble();
            double kg = pounds / 2.20462;
            System.out.println("Weight in kilograms = " + kg + " kg");
        } 
        else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}