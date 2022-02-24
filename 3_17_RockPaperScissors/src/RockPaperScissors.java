import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a number to select Rock(0), Paper(1)" +
                " or Scissors(2): ");
        int userInput = scnr.nextInt();
        int computerInput = (int) (Math.random()*3);

        if (userInput==0 && computerInput==2){
            System.out.println("Rock beats Scissors. You win!");
        }else if(userInput==1 && computerInput==0){
            System.out.println("Paper beats Rock. You win!");
        }else if(userInput==2 && computerInput==1){
            System.out.println("Scissors beats Paper. You win!");
        }else if(userInput==2 && computerInput==0){
            System.out.println("Rock beats Scissors. You lose!");
        }else if(userInput==0 && computerInput==1){
            System.out.println("Paper beats Rock. You lose!");
        }else if(userInput==1 && computerInput==2){
            System.out.println("Scissors beats Paper. You lose!");
        }else{
            System.out.println("You and the computer made the same selection." +
                    " It's a draw!");
        }

    }
}
