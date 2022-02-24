/**
   TODO - add here any import statements that your code needs.
**/

public class COP2513IE0Smallest{
   
   /**
      TODO - write this method.
      
      This method returns 1 if vector v1 is the "smallest", 2 if it is vector v2,
      or 0 otherwise.
      
      We define "smallest" as follows; 
      .  If one of the vector has fewer elements than the other, it is the smallest one.
      .  If both are the same size, then we look at every element one by one in order.
      .  As soon as one of the two vectors has an element that is < than the corresponding
         element from the other vector, then it is recognized as the "smallest" one by our method.
   **/
   public static int smallest(int[] v1, int[] v2){
      return 0; // always returns 0 for now, replace this with your code
   }// end method smallest
   
   
   /*
      You do not have to modify the main method except if adding more tests helps you ensure
      that your program fulfills all requirements.
   */
   public static void main(String[] args){
      System.out.println("Testing your method smallest(...)");
      
      
      
      int[][] testVectors1 = {
         {1,2,3},
         {1,2,3,4},
         {1,2,3},
         {1,2,3}, 
         {2,3,4}
      };
      
      int [][] testVectors2 = {
         {1,2,3,4},
         {1,2,3},
         {1,2,3},
         {2,3,4},
         {1,2,3}         
      };
      
      int [] expectedOutcomes = {
         1, 2, 0, 1, 2
      };
      
      if((expectedOutcomes.length != testVectors2.length)
         ||(expectedOutcomes.length != testVectors1.length)
         ||(testVectors1.length != testVectors2.length)){
         System.out.println("All tables must have the same # of tests");
         System.exit(-1);
      }// end if
      
      int nTests = expectedOutcomes.length;
      
      for(int test=0; test < nTests ; test++){
         int observedOutcome = smallest(testVectors1[test], testVectors2[test]);
         System.out.print("\tTest #" + test + " with vectors " 
               + Arrays.toString(testVectors1[test]) + " and " + Arrays.toString(testVectors2[test]));
         if(observedOutcome == expectedOutcomes[test])
            System.out.println(" SUCCEEDED");
         else
            System.out.println(" FAILED");
      }// end for loop
   
   }// end main method



} // end class