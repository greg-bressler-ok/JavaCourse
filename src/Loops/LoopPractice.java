package Loops;

import java.util.Scanner;

public class LoopPractice {
    public static void main(String[] args) {
        /*
        * A person purchased a product to pay in 20 months.
        * The first month he paid $10, the second $20, the third $40, and so on.
        Make a program to determine how much you must pay each month
        * and the total amount you will pay after 20 months.
        * */

        //variables
        int months = 20;
        int payment = 10;
        int initialPayment = 5;
        int totalPayment = 0;

        for(int i = 1 ; i <= months; i++){
            initialPayment = initialPayment * 2;
            payment = initialPayment;
            totalPayment = totalPayment + payment;
            System.out.println("Payment #"+ i +" is: "+ payment +". Total Payment is: "+ totalPayment);

        }
    }
}
