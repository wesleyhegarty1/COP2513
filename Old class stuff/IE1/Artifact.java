import java.util.Scanner;
import java.util.Date;

// TASK #0 - Feel free to add here any import statements that you need to implement the methods below

/**
   TOTAL 11 points
   This class is meant to model information about a rare artifact to be stored in a warehouse.
   The code below compiles but is missing critical parts that you need to write. 
   Look for the TASK keyword to tell you what you need to do.
   You may work on these tasks in a different order but they are numbered
   so as to provide you with a logical order to follow.
**/
public class Artifact{

   /* TASK #1 - 2.5 points (0.5 per attribute properly declared)
      Declare the following attributes as private:
         designation          of data type   String
         provenance           of data type   String
         monetaryValue        of data type   double
         encumbranceFactor    of data type   int
         dateAcquired         of data type   Date
      The meaning of these attributes is as follows:
         designation represents the name of the artifact.
         provenance represents from where the artifact originates.
         monetaryValue represents its value, expressed in dollars.
         encumbranceFactor represents how large and heavy the artifact is.
         dateAcquired represents the date at which the artifact was acquired. 
   */  
    private String designation;
    private String provenance;
    private double monetaryValue;
    private static int encumbranceFactor;
    private Date dateAquired; 

   
   /* TASK #2 - 2.5 points (0.5 per attribute properly initialized)
      Write the code for the following constructor.
      You will initialize all attributes with their corresponding parameters.
      dateAcquired will be set to the reference of an object of class Date that
      you will create to remember that the corresponding artifact was just acquired.
      Do not alter the name of the parameters.
   */
   
   designation artifactDesignation = new designation();
   System.out.println("Artifact designation: " + artifactDesignation.getDesignation());
   
   provenance artifactProvenance = new provenance();
   System.out.println("Provenance of artifact: " + artifactProvenance.getProvenance());
   
   monetaryValue artifactMonetaryValue = new monetaryValue();
   System.out.println("Monetary value of artifact: " + artifactMonetaryValue.getMonetaryValue());
   
   encumbranceFactor artifactEncumbranceFactor = new encumbranceFactor();
   System.out.println("Encumbrance factor of artifact: " + artifactEncubranceFactor.getEncumbranceFactor());
   
   dateAquired artifactDateAquired = new dateAquired();
   System.out.println("Date of artifact aquisition: " + artifactDateAquired.getDateAquired());
   
   public Artifact(String designation, String provenance, double monetaryValue, int encumbranceFactor){
   
   designation = "The crystal skull";
   provenance = "unknown";
   monetaryValue = 9001;
   encumbranceFactor = 11;
   
   }// end constructor with 3 args
  
  
  
   /* TASK #3 - 1 point 
      Write the code for the following constructor.
      This one takes only 3 parameters and sets the provenance to "Unknown".
      To get full credit, make sure to reuse the constructor written in task #2.
      Do not alter the name of the parameters.
   */
   public Artifact(String designation, double monetaryValue, int encumbranceFactor){

   designation = "Ruddy Mysterious Artifact";
   provenance = "unknown";
   monetaryValue = 100.0;
   encumbranceFactor = 1;
   dateAquired = date.toString();
   

   }// end constructor with 3 args
   
   
   
   /* TASK #4 - 1 point
      Write the code for the following no-args constructor.
      The attributes should end up with the following values:
         "Ruddy Mysterious Artifact" for the designation
         "Unknown" for the provenance
         monetaryValue of $100.0
         encumbranceFactor of 1
         dateShipped initialized to current date
      To get full credit, make sure to reuse the constructor written in task #3
      instead of, for example, repeating similar initializations in this one.
      
   */
   public Artifact(){

   }// end no-args constructor 
   
  
   
   /* TASK #5 - 1 point
      Write a method that returns the result of dividing the monetaryValue
      of the artifact by it encumbranceFactor.
   */
   public double estimateNormalisedValue(){
      return 0.0; // this is not right, replace this with your own code
   }// end method getTotalPrice
   
   
   
   /* TASK #6 - 1 point
      Write a method that increases the attribute monetaryValue by an amount
      corresponding to a tax percentage passed as parameter. 
      If the parameter t is not between 0.0 and 1.0 (both inclusive), then do
      not modify the attribute. Make sure to test this too.
      If it is between 0.0 and 1.0 (both inclusive), then increase monetaryValue
      by that much. 
      Example: 
         monetaryValue contains 100.0
         We call with parameter t set to 0.25
         monetaryValue will be modified to contain 125.0
   */
   public void applyTaxes(double t){

   }// end method increaseQuantity
   
   
   
   /* TASK #7 - 2 points (0.5 per attribute properly represented in the String)
      Write a method that returns a string that represents the information stored
      in the object in a human-readable format. We are going to ignore the 
      dateAcquired attribute.
      For example, if your object holds the following information: 
         designation is "Necronomicon"
         provenance is "Warehouse 13"
         monetaryValue is $31337.0
         encumbranceFactor is 42
      Then, the string that your method returns should be:
         "Necronomicon (Warehouse 13): valued at $31337.0, encumbrance factor of 42."
   */
   public String toString(){
      return ""; // this is not right, replace this with your own code
   }// end method toString
   
   
   
}// end class
