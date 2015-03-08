/** mms project
 * Created by c4q-joshelynvivas on 3/8/15.
 */
import java.util.Scanner;

public class Mnms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("You have 100 M&Ms to eat.");
        int mm = 100;
        while (mm > 0) {
            System.out.println("eat how many?");
            int em = scanner.nextInt();
            System.out.println("You have " + (mm - em) + " M&Ms left");
            mm = mm - em;
        }
        if (mm == 0) {
            System.out.println("you ate all the M&Ms");

            // or do:
            //after Scanner scanner part, do:
            //
            // int count = 100;
            // while (count > 0) {
            //System.out.println("You have " + count + " M&Ms left");
            //
            //    System.out.println("eat how many?");
            //    int eat = scanner.nextInt();
            //    if (eat < 0) {
            //    System.out.println{"It's negative")

        }

    }
}