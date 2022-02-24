

public class DateTranslation {
   
   public static String formatDate(int pDay, int pWeekDay, int pMonth){
      return  formatWeekDay(pWeekDay);
   }// end formatDate

   public static String formatMonth(int pMonth){
      return "";
   }// end formatMonth

   public static String formatWeekDay(int value){
      String[] days = { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
      return days[value-1];
      /*
      if(value==1) return "Monday";
      else if ;
      */
   }//end method formatWeekDay
   
   public static String formatDay(int value){
      return "";
   }//end method formatDay
} // end class

