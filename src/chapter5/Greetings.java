package chapter5;
import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        greet(name);
    }

    public static void greet(String name){
        System.out.println("Hi, "+ name +"! It's so nice to meet you!");
    }
}
