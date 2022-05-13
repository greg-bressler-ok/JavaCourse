package Loops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean runAgain;
        do{

            System.out.println("What is your first number?");
            double num1 = scanner.nextDouble();
            System.out.println("What is your second number?");
            double num2 = scanner.nextDouble();
            double sum = num1 + num2;
            System.out.println("The sum is " + sum);
            System.out.println("Would you like to go again? True/False");
            runAgain = scanner.nextBoolean();
        } while(runAgain);
        scanner.close();
    }
}
