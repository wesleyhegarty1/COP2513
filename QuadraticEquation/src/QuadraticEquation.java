/*
When the discriminant is positive, there are two real roots.
When zero, only one real root exists
When negative, there are no real roots
*/

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        System.out.println("Please enter values for a, b, and c each separated by a space:");
        double a = scnr.nextDouble();
        double b = scnr.nextDouble();
        double c = scnr.nextDouble();

        double d = (Math.pow(b,2))-(4*a*c); // d is the discriminant

        double quadraticPlus = (-b + Math.pow(d, 0.5))/(2*a);
        double quadraticNega = (-b - Math.pow(d, 0.5))/(2*a);

        if (d > 0) {
            System.out.println("There are two real roots.");
            System.out.println("Root 1 = " + quadraticPlus);
            System.out.println("Root 2 = " + quadraticNega);
        }else if (d == 0) {
            System.out.println("Your equation has only one real root.");
            System.out.println("Real root = " + quadraticPlus);
        }else {
            System.out.println("Your equation offers no real roots.");
        }

    }
}
