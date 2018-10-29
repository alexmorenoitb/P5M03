/*
Author: Alexander Alfonso Moreno Castro
Starting date: 26/10/2018
Ending date: 29/10/2018
Objective: Program that requests 10 integers and show them by screen determining how many are positives, negatives or zero.
 */
import java.util.Scanner;
public class E01_NumerosSencers {
    //Declared variables
    public static void main(String[] args){
        Scanner requestValues = new Scanner(System.in);
        int integer;
        int requestedNumber;
        int positive = 0;
        int negative = 0;
        int zero = 0;
        boolean correctInteger;

    //Welcome message and request for numbers
        System.out.println("\nNow we are going to determine if the following integers are positives, negatives or zeros.");
        System.out.println("\nPlease, enter 10 integers:");
        for (requestedNumber = 0; requestedNumber < 10; requestedNumber ++){
            do {
                correctInteger = requestValues.hasNextInt();
                if (!correctInteger) {
                    System.out.println("That's not an integer, please enter the number correctly.");
                    requestValues.nextLine();
                }
            } while (!correctInteger);
                integer = requestValues.nextInt();
                requestValues.nextLine();
                if (integer == 0) {
                    zero++;
                } else if (integer > 0) {
                    positive++;
                } else {
                    negative++;
                }
        }
        System.out.println("" + zero + " integers are zero.");
        System.out.println("" + negative + " integers are negative.");
        System.out.println("" + positive + " integers are positive.");
    }}

