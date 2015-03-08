/** Holiday Dates
 * Created by c4q-joshelynvivas on 3/8/15.
 */
import java.util.Scanner;

public class Holidays {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter month and day: ");
        String month =  scanner.next();
        int day = scanner.nextInt();

        String holiday;
        if(month.equalsIgnoreCase("january")
            && day == 1)
            holiday = "New Years Day";
        else if (month.equalsIgnoreCase("may")
            && day == 5)
            holiday = "Cinco de Mayo";
        else if (month.equalsIgnoreCase("december")
                && day == 25)
            holiday = "Christmas";
        else if (day == 31)
            holiday = "New Years Eve";
        else holiday = "the holiday season";





    }
}
