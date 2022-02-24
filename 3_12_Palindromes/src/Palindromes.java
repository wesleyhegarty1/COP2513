import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter a three digit integer: ");
        int userInput = scnr.nextInt();

        String original = Integer.toString(userInput);
        String reversal = "";

        int ones = userInput % 10;
        int tens = (userInput / 10) % 10;
        int hundos = userInput / 100;

        reversal = Integer.toString(ones) +
                Integer.toString(tens) +
                Integer.toString(hundos);

        System.out.println("Integer entered: " + original);
        System.out.println("Integer reversed: " + reversal);

        if(reversal.equals(original)){
            System.out.println(userInput + " is a palindrome.");
        }else{
            System.out.println(userInput + " is not a palindrome");
            System.out.println("A palindrome is a string of characters that depict the same thing when reversed.");
        }

    }
}
