/*
Author: Alexander Alfonso Moreno Castro
Starting date: 29/10/2018
Ending date: 29/10/2018
Objective: Program that shows by screen all the even numbers that are minor than 20.
 */
public class E02_ParellsMenorsDeVint {
    //Declared variables
    public static void main(String[] args){
        int evenMinor;
    //Welcome message and request for numbers
        System.out.println("\nNow we are going to see which even numbers are minor than 20.");
        for (evenMinor = 2; evenMinor < 20; evenMinor += 2) {
            System.out.println(""+ evenMinor +" is an even number minor than 20.");
        }
    }

}
