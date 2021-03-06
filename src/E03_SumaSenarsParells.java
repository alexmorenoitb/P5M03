/*
Author: Alexander Alfonso Moreno Castro
Starting date: 29/10/2018
Objective: Program that sums even numbers and odd numbers that are minor than 100.
Ending date: 29/10/2018
 */
public class E03_SumaSenarsParells {
    //Declared variables
    private static final int CONSTANT = 100;
    public static void main(String[] args) {
        int i, evenNumber = 0, oddNumber = 0;
    //Welcome message and request for numbers
        System.out.println("\nNow we are going to sum even numbers and odd numbers that are minor than 100.");
        for (i = 1;i < CONSTANT;i++) {
        if (i%2 == 0) {
                evenNumber+= i;
        } else {
                oddNumber+= i;
            }
        } System.out.println("\nSum of even numbers:"+ evenNumber +".");
        System.out.println("\nSum of odd numbers:"+ oddNumber +".");
    }
}