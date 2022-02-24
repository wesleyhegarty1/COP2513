import java.util.Scanner;

public class FindFutureDates {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        System.out.println("Sunday is 0, Monday is 1, . . . , and Saturday is 6");
        System.out.print("Enter an integer representing this day of the week: ");
        int today = scnr.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int daysElapsed = scnr.nextInt();

        String presentDay = null;
        String futureDay = null;

        switch (today) {
            case 0: presentDay = "Sunday"; break;
            case 1: presentDay = "Monday"; break;
            case 2: presentDay = "Tuesday"; break;
            case 3: presentDay = "Wednesday"; break;
            case 4: presentDay = "Thursday"; break;
            case 5: presentDay = "Friday"; break;
            case 6: presentDay = "Saturday"; break;
        }

        switch ((today + daysElapsed)%7) {
            case 0: futureDay = "Sunday"; break;
            case 1: futureDay = "Monday"; break;
            case 2: futureDay = "Tuesday"; break;
            case 3: futureDay = "Wednesday"; break;
            case 4: futureDay = "Thursday"; break;
            case 5: futureDay = "Friday"; break;
            case 6: futureDay = "Saturday"; break;
        }

        System.out.println("Today is " + presentDay +
                " and the future day you've selected is a " + futureDay + ".");

    }
}
