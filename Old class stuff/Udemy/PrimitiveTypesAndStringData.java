public class PrimitiveTypesAndStringData{
   public static void main(String[] args){
   
   /*
   EIGHT PRIMITIVE DATA TYPES COVERED SO FAR:
   
   byte
   short
   int
   long
   float
   double
   char
   boolean
   */
   
   // A STRING is a data type that is NOT a primitive
   
   String myString = "This is a string";
   System.out.println("myString is equal to " + myString);
   myString = myString + ", and this is more.";
   System.out.println("myString is equal to " + myString);
   myString = myString + " \u00A9 2019";
   System.out.println("myString is equal to " + myString);
   
   String numberString = "250.55";
   numberString = numberString + "49.95";
   System.out.println(numberString);
   
   String lastString = "10";
   int myInt = 50;
   lastString = lastString + myInt;
   System.out.println("lastString is equal to " + lastString);
   
   //Strings in Java are immutable
   }
   
}