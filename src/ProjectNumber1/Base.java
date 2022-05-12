package ProjectNumber1;

import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        System.out.println("Enter the number of hours worked: ");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        System.out.println("The rate per hour: ");
        double value = scanner.nextDouble();
        scanner.close();

        //Calculate pay
        double pay = hours*value;
        System.out.println("Total pay is: $" + pay);

    }
}
