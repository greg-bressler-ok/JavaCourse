package TestResults;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("What was your letter grade?");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        String message;
        switch(grade){
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great Job!";
                break;
            case "C":
                message = "Good job!";
                //break;
                System.out.println(message);
            case "D":
                message = "You need to work harder.";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:
                message = "Error!  Invalid grade";
                break;
        }

        System.out.println(message);
    }
}
