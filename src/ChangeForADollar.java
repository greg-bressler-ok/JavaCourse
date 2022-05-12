import java.util.Scanner;

public class ChangeForADollar {
    public static void main(String[] args) {
        double change;
        String message;

        System.out.println("How many pennies would you like?");
        Scanner scanner = new Scanner(System.in);
        double pennies = scanner.nextDouble();
        System.out.println("How many nickles would you like?");
        double nickles = scanner.nextDouble();
        System.out.println("How many dimes would you like?");
        double dimes = scanner.nextDouble();
        System.out.println("How many quarters would you like?");
        double quarters = scanner.nextDouble();

        change = (pennies + (nickles * .05) + (dimes * .1) + (quarters * .25));

        //if Else If
        if(change == 1.00){
            System.out.println("That's $1 exactly!  You win!");
        } else if(change > 1.00){
            System.out.println();
        } else {

        }
    }
}
