import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

/** Truth Table and Days of the week
 * Created by c4q-joshelynvivas on 3/8/15.
 */
import java.util.Scanner;

public class truthTable{
        public static void main(String[] args) {
            System.out.println("true  && true  = " + (true && true));
            System.out.println("true  && false = " + (true && false));
            System.out.println("false && true  = " + (false && true));
            System.out.println("false && false = " + (false && false));

            System.out.println("true || true = " + (true || true));
            System.out.println("true || true = " + (true || false));
            System.out.println("false || true = " + (false || true));
            System.out.println("false || true = " + (false || false));

            System.out.println("true ^ true = " + (true ^ true));
            System.out.println("true ^ true = " + (true ^ false));
            System.out.println("false ^ true = " + (false ^ true));
            System.out.println("false ^ true = " + (false ^ false));

            System.out.println("Type in the day of the week. ");
            Scanner scanner = new Scanner(System.in);
            String day = scanner.nextLine();
            if      (day.equalsIgnoreCase("monday")||
                    day.equalsIgnoreCase("tuesday")||
                    day.equalsIgnoreCase("wednesday")||
                    day.equalsIgnoreCase("thursday")||
                    day.equalsIgnoreCase("friday"))
            System.out.println("This is a weekday.");

            else if (day.equalsIgnoreCase("Saturday") ||
                    day.equalsIgnoreCase("Sunday"))
            System.out.println("This is a weekend");

            else
            System.err.println("This is not a day of the week"); //instead of System."out"//

            }
        }