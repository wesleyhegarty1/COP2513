// Feel free to add here any import statements that you need
import java.util.Date;


/** TOTAL = 10 points
   This class models information we keep about a sick leave request.
   The code below compiles but is missing critical parts that you need to write. 
   Look for the TASK tags to tell you what you need to write.
   You may work on these tasks in a different order but they are numbered
   so as to provide you with a logical order to follow.
**/
public class IE3aSickLeaveRequest {


   /* TASK #1 - 1 point (.2 per attribute)
      Declare the following attributes as private:
         employeeName      of data type   String
         numberOfDays      of data type   int
         reasonForRequest  of data type   String
         isApproved        of data type   boolean
         dateApproved      of data type   Date
   */


   /* TASK #2 - 1 point (.2 per attribute)
      Write the code for the following constructor.
      Do not alter the name of the parameters.
      Initialize appropriately ALL attributes.
      If the parameter numberOfDays is <= 0, set it to 1.
      The attribute isApproved should be false by default
      and the attribute dateApproved should be null.
   */
   public IE3aSickLeaveRequest(String employeeName, int numberOfDays, String reasonForRequest){
      
   }// end constructor



   /* TASK #3 - 1 point
      Write the code for the following method so that
      it sets the isApproved attribute to true (.5 point)
      and records the time and date that it was approved
      in the attribute dateApproved (.5 point).
   */
   public void approve(){
      
   }// end approve method
   
   
   
   /* TASK #4 - 1 point
      Write the code for the following method so that
      it sets the isApproved attribute to false (.5 point)
      and set dateApproved so that it no longer reference
      any specific object of class Date (.5 point).
   */
   public void deny(){
      
   }// end approve method



   /* TASK #5 - 1 point
      Write the code for the following method so that
      it returns true if the String parameter matches
      the name stored in the employeeName attribute.
   */
   public boolean identifyEmployee(String employeeName){
      return false;
   }// end method identifyEmployee
   

   
   /* TASK #6 - 1 point
      Write the code for the following method so that
      it returns the value of the attribute numberOfDays
   */
   public int getNumberOfDays(){
      return 0;
   }// end method getNumberOfDays
   
   
   
   /* TASK #7 - 4 point (1 for each component of the String)
      Write the code for the following method so that
      it returns a String representing the information
      stored in the attributes. 
      The following examples illustrate the format that you 
      must follow in your strings;
         example #1 "John Smith, 1 day for 'new game released' NOT APPROVED YET"
         example #2 "Jane Doe, 28 days for 'zombies' APPROVED"
         example #3 "Jake Von Statefarm", 2 days for 'finding a new job' APPROVED"
      Please note that if the number of day is 1, we use "day"
      instead of "days" in the String that we return.
   */
   public String toString(){
      // replace the code in this method by your code
      String result = "";
      return result;
   }// end toString method

}// end class
