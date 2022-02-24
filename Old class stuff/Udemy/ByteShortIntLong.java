public class ByteShortIntLong {

   public static void main(String[] args) {
      
      int myValue = 10000;
      int myMinIntValue = Integer.MIN_VALUE;
      int myMaxIntValue = Integer.MAX_VALUE;
      System.out.println("Integer minimum value = " + myMinIntValue);
      System.out.println("Integer maximum value = " + myMaxIntValue);
      System.out.println("Overflowing MAX int value = " + (myMaxIntValue+1));
      System.out.println("Overflowing Min int value = " + (myMinIntValue-1));
      
      int myMaxIntTest = 2_147_483_647;
      
      byte myMinByteValue = Byte.MIN_VALUE;
      byte myMaxByteValue = Byte.MAX_VALUE;
      System.out.println("Byte Minimum Value = " + myMinByteValue);
      System.out.println("Byte Maximum Value = " + myMaxByteValue);
      
      short myMinShortValue = Short.MIN_VALUE;
      short myMaxShortValue = Short.MAX_VALUE;
      System.out.println("Short Minimum Value = " + myMinShortValue);
      System.out.println("Short Maximum Value = " + myMaxShortValue);

      long myMinLongValue = Long.MIN_VALUE;
      long myMaxLongValue = Long.MAX_VALUE;
      System.out.println("Long Minimum Value = " + myMinLongValue);
      System.out.println("Long Maximum Value = " + myMaxLongValue);
      
      short bigShortLiteralValue = 32767;      
      int myTotal = (myMinIntValue / 2);
      byte myNewByteValue = (byte) (myMinByteValue / 2);
      short myNewShortValue = (short) (myMinShortValue / 2);
   }
}

// Eight primitive data types in Java: boolean, byte, char, short, int, long, float, double
// Integer (not int) is considered a "wrapper" class thing (what does this mean?)
// Data types have a range of possible values.
// Underscores may be used in place of commas when writing giant numbers
// Byte = 8bits wide
// Short = 16bits wide
// Int = 32bits wide
// Long = 64bits wide (every long value must also have a capital "L" appended to its number)
// The default whole number in Java is an integer
// Casting means to treat or convert a number from one type to another.  We put the type we want the number to be in parenthesis
// (byte)(myMinByteValue/2);
// In Java, just always use Int unless there is a clearly good reason not to.