import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;

public class FieldTrip {
    public static void main(String[] args) {
//        If there are 100 students or more, the cost per student is 65 euros.
//                * From 50 to 99 students, the cost is 70 euros.
//                * From 30 to 49 students, the cost is 95 euros.
//  Less than 30 students, the cost of renting the bus is 4,000 euros, regardless of the number of students.
int numberOfStudents;
int cost;
Scanner scanner = new Scanner(System.in);
        System.out.println("How many students are going?");
        numberOfStudents = scanner.nextInt();
        scanner.close();
        if(numberOfStudents >= 100){
            cost = numberOfStudents * 65;
            System.out.println("The cost of the field trip is: " + cost);
        } else if ((numberOfStudents >= 50 ) && (numberOfStudents <= 99 )  ) {
            cost = numberOfStudents * 70;
            System.out.println("The cost of the field trip is: " + cost);
        } else if ((numberOfStudents >= 30 ) && (numberOfStudents <= 49 )) {
            cost = numberOfStudents * 95;
            System.out.println("The cost of the field trip is: " + cost);
        }else{
            cost = 4000;
            System.out.println("The cost of the field trip is: " + cost);
        }


    }


}
