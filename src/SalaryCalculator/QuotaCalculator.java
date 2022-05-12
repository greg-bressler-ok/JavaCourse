package SalaryCalculator;

import java.util.Scanner;

/*
Calculating quota and salary
 */
public class QuotaCalculator {
    public static void main(String[] args) {
        //Initialize knowns
        int quota = 10;
        int salary = 1000;
        int bonus = 250;

        //Get unknowns
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Decisions & Calculations
        if(sales >= quota){
            salary =  salary + bonus;
            System.out.println("Congrats!  You've met your quota!");
        }
        else{
            int salesShort = quota - sales;
            //need to handle "1 saleS" differently...maybe nestedIf or elseIf...or Switch
            System.out.println("Try a bit harder. You were " +salesShort+  " sales short.  I'm sure you'll get it next time.");
        }
        //Output
        System.out.println();
    }
}
