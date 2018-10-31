/*
Author: Alexander Alfonso Moreno Castro
Starting date: 29/10/2018
Ending date: 29/10/2018
Objective: Program that sums even numbers and odd numbers that are minor than a number entered by the user
 */
import java.util.Scanner;
public class E04 {
    //Declared variables
    public static void main(String[] args){
        Scanner requestValues = new Scanner (System.in);
        int i, evenNumber = 0, oddNumber = 0, requestedNumber;
        boolean correctInteger;
    //Welcome message and revision that user enters the requested values
        System.out.println("\nNow we are going sum odd numbers and even numbers that are minors than the number that you want.");
        System.out.println("Please enter an integer:");
        do {
            correctInteger = requestValues.hasNextInt();
            if (!correctInteger){
                System.out.println("That's not an integer. Enter correctly please.");
                requestValues.nextLine();
            }
        } while (!correctInteger);
            requestedNumber = requestValues.nextInt();
            requestValues.nextLine();
            for (i = 1;i < requestedNumber;i++) {
              if (i%2 == 0) {
                  evenNumber+= i;
              } else {
                  oddNumber+= i;
              }
        } System.out.println("\nSum of even numbers:"+ evenNumber +".");
        System.out.println("\nSum of odd numbers:"+ oddNumber +".");
}}
