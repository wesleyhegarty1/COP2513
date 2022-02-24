/*
(Physics: acceleration) Average acceleration is defined as the change of velocity
divided by the time taken to make the change.
Write a program that prompts the user to enter the
starting velocity v0 in meters/ second, the ending velocity v1 in meters/second,
and the time span t in seconds, then displays the average acceleration.
 */
import java.util.Scanner;

public class CalculatingAverageVelocity {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("What is your object's initial velocity? (m/s)");
        double v0 = input.nextDouble();

        System.out.print("What is your object's final velocity? (m/s)");
        double v1 = input.nextDouble();

        System.out.print("How much time was required for your object to undergo this change in velocity? (seconds)");
        double seconds = input.nextDouble();

        double avgAcceleration = (v1 - v0)/seconds;
        System.out.print("Your object's average acceleration is equal to " + avgAcceleration + " meters per second.");
    }
}
