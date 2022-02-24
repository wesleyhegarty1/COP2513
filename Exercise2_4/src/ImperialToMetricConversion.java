/*
(Convert pounds into kilograms) Write a program that converts pounds into kilograms.
The program prompts the user to enter a number in pounds, converts it to kilograms,
and displays the result. One pound is 0.454 kilogram.
 */

import java.util.Scanner;

public class ImperialToMetricConversion {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Hello");
        System.out.println("Enter a magnitude value of pounds: ");
        double pounds = input.nextDouble();
        double kilograms = pounds/2.2;
        System.out.println("Your value in kilograms = " + kilograms + ".");

    }

}

/*
how do I cut off the number of printed decimal places?  What is that called?  Truncating?

How should I type a condition loop that would allow me to choose to convert either pounds,
    or kilograms into the other measurement through user input?
 */