package ProjectNumber3;


import java.util.Scanner;

//Loan Eval
public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = 1000;
        int years = 5;

        System.out.println("How much ya got?");
        double money_personal = scanner.nextDouble();
        System.out.println("How many years have you worked?");
        double years_worked = scanner.nextDouble();
//if((money_personal >= money) && (years_worked >= years))
        if(money_personal >= money){
            if(years_worked >= years){
                System.out.println("You are eligible get the credit");

            }else{
                System.out.println("You cannot get the credit");
            }
        }else{
            System.out.println("You cannot get the credit");
        }

        System.out.println("works");
    }
}
