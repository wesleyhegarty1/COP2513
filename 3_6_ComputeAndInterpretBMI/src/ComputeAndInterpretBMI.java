import java.util.Scanner;

public class ComputeAndInterpretBMI {
    public static void main(String[] args){
        final double KPP = 0.45359237; //pounds to kilos ratio
        final double MPI = 0.0254;  //inches to meters ratio
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter your weight in pounds: ");
        double weight = scnr.nextDouble();
        System.out.print("Enter your height in feet and inches with numbers separated by one space:");
        double feet = scnr.nextDouble();
        double inches = scnr.nextDouble();
        double totalInches = (feet*12)+inches;
        double kilos = weight * KPP;
        double meters = totalInches * MPI;
        double bmi = kilos/(meters*meters);

        System.out.println("BMI is " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        }else if (bmi < 25){
            System.out.println("Normal");
        }else if (bmi < 30){
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }
    }
}
