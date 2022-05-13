package Loops;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        /*
         * FOR LOOP:
         * Write a cashier program that will scan a given number of items and tally the cost.
         */
        System.out.println("Enter the number of items you would you like to scan:");
        Scanner scanner = new Scanner(System.in);
        int quantity  = scanner.nextInt();
        double total = 0;
        for(int i=1; i < quantity+1; i++){
            System.out.println("Enter the cost of item "+ i +" of "+ quantity);
            double price = scanner.nextDouble();
            total = total + price;
        }
        scanner.close();
        System.out.println("Your total is $" + total);
    }
}
