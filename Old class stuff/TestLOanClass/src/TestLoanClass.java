import java.util.Scanner;

public class TestLoanClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        System.out.println("Enter the number of years in whole numbers: ");
        int numberOfYears = input.nextInt();

        System.out.println("Enter loan amount: ");
        double loanAmount = input.nextDouble();

        Loan loan =
                new Loan(annualInterestRate, numberOfYears, loanAmount);

        System.out.printf(  "The loan was created on %s\n" +
                "The monthly payment is %.2f\n" +
                "The total payment is %.2f\n", loan.getLoanDate().toString(), loan.getMonthlyPayment(),
                loan.getTotalPayment()  );
    }
}

/**
 * This pair of classes functions how I thought methods functioned.  What is the difference?
 *      What differences should I notice?
 *
 * "loan.getLoanDate().toString()"
 *      -loan is specifying the class from which information is gathered, right?
 *      -getLoanDate() is the method within the loan class, right?
 *      -toString() appears to be a method.  Did I make it?  Is it just something natively
 *          supported by Java?  Is this an example of casting?
 *
 * How many specific objects are in this program?  Where are they?  I think
 *      Loan loan = "new" ... is the beginning of a new object, right?
 *
 * Do all objects require the "new" keyword at some point?
 *
 * 
 */
