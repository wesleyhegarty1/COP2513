/*
(Find the number of years) Write a program that prompts the user to enter the minutes (e.g., 1 billion),
and displays the maximum number of years and remain- ing days for the minutes. For simplicity,
assume that a year has 365 days.
 */

import java.util.Scanner;

public class MinutesToYearsAndDays {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a whole magnitude value for minutes: ");
        int minutes = input.nextInt();

        int wholeYears = minutes /(365 * 24 * 60);
        double yearRemainder = minutes%(365 * 24 * 60);
        int wholeDays = (int) (yearRemainder/(24*60));

        System.out.println("Your value represented in years and days is " + wholeYears + " years and "
                + wholeDays + " full days.");

    }
}

/*
What about when I enter a number that is too big?  How should I resolve that?

How big is too big?
 */
