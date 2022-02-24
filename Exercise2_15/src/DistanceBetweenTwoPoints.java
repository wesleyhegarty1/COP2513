/*
Have the user enter two cartesian points and have the program
calculate the distance between these two points.
Use Math.pow(variableValue, powerValueIsRaisedTo).
 */
import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Please enter the X and Y coordinates of your first point: ");
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();

    System.out.print("Please enter the X and Y coordinates of your second point: ");
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();

    double distanceBetweenPoints = Math.pow(
            Math.pow(x2-x1,2) + Math.pow(y2-y1,2) , 0.5
    );

    System.out.println("(" + x1 + "," + y1 + ")");
    System.out.println("(" + x2 + "," + y2 + ")");
    System.out.println("The distance between these two points is " + distanceBetweenPoints);

    }
}

/*
Math.pow(valueEntered, powerValueIsRaisedTo)  was super useful!  Where can I find more functions like this?
    What are these functions technically called in Java.  Is there a master list?

In order to ask for multiple inputs from the user, all I have to do is place as many input methods following
    the printed request.  Java will continue to wait until enough values have been entered.

How can I get values entered from the keyboard to be separated by something more intuitive, like a comma?
    Is there a way to do that without receiving an error?

How do I get this program to run again based on user input?
 */
