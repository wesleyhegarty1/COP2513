import java.util.Scanner;

public class CostOfShipping {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter the weight of your package: ");
        double shippingWeight = scnr.nextDouble();
        double shippingCost = 100000000000.0;

        if (0<shippingWeight && shippingWeight<=1){
            shippingCost = 3.50;
        }else if(1<shippingWeight && shippingWeight<=3){
            shippingCost = 5.50;
        }else if(3<shippingWeight && shippingWeight<=10){
            shippingCost = 8.50;
        }else if(10<shippingWeight && shippingWeight<=20){
            shippingCost = 10.50;
        }else{
            System.out.println("Your package cannot be shipped.");
        }

        System.out.println("Shipping cost = " + shippingCost);

    }
}
