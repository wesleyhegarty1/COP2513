public class IfElseCodeBlocks{
   public static void main(String[] args){
      boolean gameOver = true;
      int score = 5000;
      int levelCompleted = 5;
      int bonus = 100;
      
//       if(score < 5000 && score>1000 ) {
//             System.out.println("Your score was less than 5000");
//          } else if(core < 1000){
//             System.out.println("Your score was less than 1000");
//          } else{
//             System.out.println("Got here");
//          }

         if(gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
            //bonus--;
         }
         //System.out.println(bonus);
   /* I printed out the bonus value just to see if I could modify a variable
      within a codeblock/if statement and still use it in its modified form outside
      the codeblock it was modified within.  The answer is yes, apparently.
   */
      int score2=10000;
      int levelCompleted2=8;
      int bonus2=200;
         if(gameOver){
            int finalScore = score2 + (levelCompleted2 * bonus2);
            System.out.println("Your final score was " + finalScore) ;
            }    
         
         
         
         
      }
   }