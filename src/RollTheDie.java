import java.util.Random;
import java.util.Scanner;

public class RollTheDie {
    public static void main(String[] args) {
        Random random = new Random();
        int rollNumber;
        int position = 0;
        int remaining;
        Scanner scanner = new Scanner(System.in);
        boolean runAgain;
        do{
            System.out.println("Let's play a game...");
            for(rollNumber = 1; rollNumber < 6; rollNumber++){
                int die = random.nextInt(6) + 1;
                position = position + die;
                remaining = (20 - position);
                if(position == 20 && rollNumber < 6){
                    System.out.println("Roll #" + rollNumber + ": You rolled a " + die + ".");
                    System.out.println("Congrats!  You did it!");
                    break;
                } else if (position > 20) {
                    int overshoot = 0;
                    //System.out.println(remaining);
                    remaining = Math.abs(remaining);
                    overshoot = remaining;
                    System.out.println("Roll #" + rollNumber + ": You rolled a " + die + ".");
                    System.out.println("Uh oh!  You overshot by "+ overshoot + "!");
                    break;
                } else if (position < 20 && rollNumber == 5) {
                    int undershoot = 0;
                    undershoot = remaining;
                    System.out.println("Roll #" + rollNumber + ": You rolled a " + die + ".");
                    System.out.println("Sorry!  You did great!  But you didn't quite make it. You fell " +undershoot+ " short.");
                }else {
                    System.out.println("Roll #" + rollNumber + ": You rolled a " + die + ". You have advanced to space " + position + " of 20.  There are " + remaining + " spaces to go!");
                }
            }
            position = 0;
            System.out.println("Would you like to play again? True/False");
            runAgain = scanner.nextBoolean();
        } while(runAgain);
        scanner.close();
    }
}
