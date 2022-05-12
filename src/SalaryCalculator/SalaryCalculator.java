package SalaryCalculator;

import java.util.Scanner;

/*
calc salary w/bonus if quota is met
 */
public class SalaryCalculator {
    public static void main(String args[]){
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //Get inputs from employee
        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Calculate Pay based on Sales
        if(sales > quota){
            salary = salary + bonus;
        }

        //Output
        System.out.println("The employee's pay is: $" + salary);
    }
}
