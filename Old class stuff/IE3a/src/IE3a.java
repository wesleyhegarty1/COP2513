// Feel free to add here any import statements that you need for your tests


/**
   Use the main() method in this class to test your other classes. 
   We provide you with minimalist tests to get you started. 
   Feel free to modify them or add as many as you need.
   This part of your code will not be graded but will help
   you ensure that your other classes fullfill the requirements.
**/
public class IE3a{
   public static void main(String[] args){

      System.out.println("I've already made the decision to withdraw.  Thank you for the semester.");

      // create an IE3aSickLeaveRequestsManager
      IE3aSickLeaveRequestsList list = new IE3aSickLeaveRequestsList();

      // create the sick leave requests for the above
      IE3aSickLeaveRequest s1 = new IE3aSickLeaveRequest("John Smith", 7, "new game released");
      IE3aSickLeaveRequest s2 = new IE3aSickLeaveRequest("Jane Doe", 28, "zombies");
      IE3aSickLeaveRequest s3 = new IE3aSickLeaveRequest("John Smith", 2, "new game released!");
      IE3aSickLeaveRequest s4 = new IE3aSickLeaveRequest("Jake Von Statefarm", 2, "finding a new job");
      IE3aSickLeaveRequest s5 = new IE3aSickLeaveRequest("John Smith", 1, "non-gaming related stuff");
      
      s1.deny();
      s3.deny();
      s5.approve();
      
      s2.approve();
      
      s4.approve();
      s4.deny();
      
      // add the sick leave requests
      list.addRequest(s1);
      list.addRequest(s2);
      list.addRequest(s3);
      list.addRequest(s4);
      list.addRequest(s5);
            
      // display information about all the requests stored
      System.out.println(list);
      
      // create an IE3aSickLeaveRequestsManager
      IE3aBetterSickLeaveRequestsList list2 = new IE3aBetterSickLeaveRequestsList();
      // add the sick leave requests
      list2.addRequest(s1);
      list2.addRequest(s2);
      list2.addRequest(s3);
      list2.addRequest(s4);
      list2.addRequest(s5);
      // display information about all the requests stored
      System.out.println(list2);
 

      System.out.println("Employee John Smith requested a total of "
            + list2.getTotalDaysForEmployee("John Smith")
            + " days");
   }// end main
}// end class