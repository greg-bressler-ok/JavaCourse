package chapter5;

import java.util.Scanner;

public class phoneBillCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double baseFee;

        System.out.println("What is the base fee for your plan? ");
        baseFee = scanner.nextDouble();

        double overageFee = calcOverageFee();
        double tax = calcTax(baseFee, overageFee);
        double total =  calcTotal(tax, baseFee, overageFee);
        System.out.println("_____________");
        System.out.println(" ");
        itemizeBill(total, tax, baseFee, overageFee);
    }

    public static double calcOverageFee(){
        double minutesOver;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is amount of overage minutes? ");
        minutesOver = scanner.nextDouble();

        double overageFee = minutesOver * 0.25;
        System.out.println("Overage Fee is: "+ overageFee);
        return overageFee;
    }

    public static double calcTax(double baseFee, double overageFee){
         baseFee = baseFee;
       overageFee = overageFee;
        double tax = (baseFee + overageFee)*0.15;
        System.out.println("Tax is: "+ tax);
        return tax;
    }

    public static double calcTotal(double tax, double baseFee, double overageFee){
        double total = baseFee+overageFee+tax;
        System.out.println("Total is: "+ total);
        return total;
    }

    public static void itemizeBill(double total, double tax, double baseFee, double overageFee){
        System.out.println("PHONE BILL STATEMENT");
        System.out.println("Base Fee: " + baseFee);
        System.out.println("Overage Fee: " + overageFee);
        System.out.println("Tax: " + tax);
        System.out.println("Total: " + total);
    }

}
