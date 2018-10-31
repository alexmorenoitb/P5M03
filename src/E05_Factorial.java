/*
Author: Alexander Alfonso Moreno Castro
Starting date: 29/10/2018
Ending date: 29/10/2018
Objective: Program that calculates the factorial of a number entered by the user.
 */
import java.util.Scanner;
public class E05_Factorial {
    public static void main (String[] args) {
        Scanner requestValues = new Scanner(System.in);
        int requestedNumber, factorial;
        boolean correctInteger;
        //Welcome message and revision that user enters the requested values
        System.out.println("\nNow we are going to calculate a factorial's number.");
        System.out.println("Please enter an integer:");
        do {
            correctInteger = requestValues.hasNextInt();
            if (!correctInteger) {
                System.out.println("That's not an integer. Enter correctly please.");
                requestValues.nextLine();
            }
        } while (!correctInteger);
        requestedNumber = requestValues.nextInt();
        requestValues.nextLine();
        factorial = requestedNumber;
        for (int i = 1; i < requestedNumber; i++){
            factorial*= (requestedNumber - i);
        }
        System.out.println("Factorial of "+ requestedNumber +" is "+ factorial +" ");


    }
}
