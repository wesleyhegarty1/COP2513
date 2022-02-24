public class IfThenStatements{
   public static void main(String[] args){
   
   boolean alien = false;
      if (alien == true){
         System.out.println("Not an alien!");
      }
      
      int topScore = 100;
      int secondScore = 80;
      if (topScore == 100){
         System.out.println("You recieved a perfect score!");
      }
      if (secondScore < topScore && secondScore < 100) {
         System.out.println("You are the runner up!");
      }
      if ((topScore > 90) || (secondScore<=90)) {
         System.out.println("Either or both conditions are true!");
      }
      
   }
}
   