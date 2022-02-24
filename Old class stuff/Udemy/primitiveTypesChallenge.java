public class primitiveTypesChallenge {

   public static void main (String[] args) {
   
   byte byteVariable = 120;
   short shortVariable = 32760;
   int intVariable = 2000000000;
   long longVariable = 50000L + (10L*(byteVariable + shortVariable + intVariable));
   
   System.out.println("My long variable equals: " + longVariable);
   
   }
   
   }