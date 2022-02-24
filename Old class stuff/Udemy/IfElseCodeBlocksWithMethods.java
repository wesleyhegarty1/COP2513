import java.util.Scanner;

public class IfElseCodeBlocksWithMethods{
   public static void main(String[] args){
      
      boolean gameOver = true;
      int score = 5000;
      int levelCompleted = 5;
      int bonus = 100;
      
      int highScore = computeScore(gameOver, score, levelCompleted, bonus);
         System.out.println("Your final score was " + highScore);

      
      score=10000;
      levelCompleted=8;
      bonus=200;
      
      highScore = computeScore(gameOver, score, levelCompleted, bonus);
         System.out.println("Your final score was " + highScore);
         
      displayHighScorePosition();

     
   }
      
   public static int computeScore(boolean gameOver, int score, int levelCompleted, int bonus){
      if(gameOver) {
         int finalScore = score + (levelCompleted * bonus);
         return finalScore;
      }else{
      return -1;
         }
                 
   }
   
   public static void displayHighScorePosition(String playerName, int highScorePosition){
       Scanner input = new Scanner(System.in);
       System.out.print("Name the winning contender: ");
       playerName = input.next();
       System.out.print("Position the player achieved: ");
       highScorePosition = input.nextInt();
       System.out.println(playerName + " managed to get into position " + highScorePosition +
         " on the high score table.");
   } 
   
}