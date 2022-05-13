package Loops;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        /*show employees their pay for period.  OT not permitted (i.e. max hours = 40) @ $15/hr*/
        int maxHours = 40;
        int rate = 15;
        System.out.println("How many hours did you work this period?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked= scanner.nextDouble();

        while(hoursWorked > maxHours){
            System.out.println("Error.  You can't work more than 40 hours per week.  Try again");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();
        double pay = rate * hoursWorked;
        System.out.println("You earned: $" + pay + " this period.");

    }
}
