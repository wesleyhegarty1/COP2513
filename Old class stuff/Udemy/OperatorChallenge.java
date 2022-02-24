public class OperatorChallenge {
   public static void main (String[] args) {
      
      double a          = 20.00d;
      double b          = 80.00d;
      double c          = (a + b) * 100.00d;
         System.out.println("Product of equation is " + c);
      double r          = c % 40.00d;
      boolean isFactor;
      
      if (r==0){
         isFactor = true;
         System.out.println("40 is a factor of 10,000.");
         System.out.println("This is " + isFactor + ".");
      }
      
      if (r!=0){
         isFactor = false;
         System.out.println("Got some remainder.");
      }   
   }
}

/*
Alternatively:
      boolean isFactor = (r==0)? true : false;
      if(!isFactor){
         System.out.println("Got some remainer.");
      }
*/