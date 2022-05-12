package ProjectNumber2;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        //input
        int value = 145;
        System.out.println("How much ya got?");
        Scanner scanner  = new Scanner(System.in);
        double money = scanner.nextDouble();
        scanner.close();

       // System.out.println("");
        //process
        if(money >= value){
            System.out.println("You can buy this product.");
        }
        else{
            System.out.println("You can NOT buy this product.");
        }
        //out

        System.out.println();
    }
}
