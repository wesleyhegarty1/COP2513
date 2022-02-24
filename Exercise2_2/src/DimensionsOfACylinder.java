/*
  (Compute the volume of a cylinder) Write a program that reads in the radius and length of a cylinder
  and computes the area and volume using the following formulas:
          area = radius * radius * π
          volume = area * length
 */
import java.util.Scanner;

public class DimensionsOfACylinder {
    public static void main(String[] args){
        final double PI = 3.14159;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a magnitude value for the radius of the cylinder: ");
        double radius = input.nextDouble();

        System.out.print("Enter a magnitude value for the height of the cylinder: ");
        double height = input.nextDouble();

        double circleSideArea = PI * radius * radius;
        double circleCircumference = 2 * PI * radius;
        double cylinderSurfaceArea = (circleSideArea * 2) + (circleCircumference * height);
        double cylinderVolume = circleSideArea * height;

        System.out.println("The surface area of the cylinder is " + cylinderSurfaceArea + ".");
        System.out.println("The volume of the cylinder is " + cylinderVolume + ".");

    }
}
