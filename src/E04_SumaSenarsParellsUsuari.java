/*
Author: Alexander Alfonso Moreno Castro
Starting date: 29/10/2018
Objective: Program that sums even numbers and odd numbers that are minor than 100.
Ending date: 29/10/2018
 */
import java.util.Scanner;
public class E04_SumaSenarsParellsUsuari {
    //Declared variables
    public static void main(String[] args) {
        Scanner requestValues = new Scanner (System.in);
        int i, evenNumber = 0, oddNumber = 0, requestedNumber;
        boolean correctInteger;
    //Welcome message and request for numbers
        correctInteger = requestValues.hasNextInt();
        if (correctInteger) {
            requestValues.nextLine();
            for (i = 1;i < requestedNumber;i++) {
                requestedNumber = requestValues.nextInt();
                requestValues.nextLine();
                if (i%2 == 0) {
                    evenNumber+= i;
                } else {
                    oddNumber+= i;
                }
            }
        } else {
            System.out.println("That's not an integer, please enter the number correctly.");
                requestValues.nextLine();
                System.out.println("\nNow we are going to sum even numbers and odd numbers that are minor than 100.");}








         System.out.println("\nSum of even numbers:"+ evenNumber +".");
        System.out.println("\nSum of odd numbers:"+ oddNumber +".");
    }
}