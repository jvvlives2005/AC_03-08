/**
 * Created by c4q-joshelynvivas on 3/8/15.
 */
import java.util.Scanner;

public class Not {
    public static void main(String[] args){
        int x = 10;
        System.out.println(x != 12);
        System.out.println(x !=10);

        String s = "grapefruit";
        System.out.println(!s.equals("pineapple" ));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you carry a sword? ");
        String response = scanner.next();
        boolean sword =
                response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y");

        System.out.print("Do you wear a helmet? ");
        response = scanner.next();
        boolean helmet =
                response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y");

        System.out.print("Do you use a shovel? ");
        response = scanner.next();
        boolean shovel =
                response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y");

        String profession;
        if (sword && helmet && ! shovel)
            profession = "samurai";
        else if (sword && ! helmet && ! shovel)
            profession = "ninja";
        else if (! sword && helmet && ! shovel)
            profession = "astronaut";
        else if (! sword && helmet && shovel)
            profession = "construction worker";
        else if (! sword && ! helmet && shovel)
            profession = "gardner";
        else if (! sword && ! helmet && ! shovel)
            profession = "coder";

        else
            profession = "unknown";

        System.out.println("Your profession is " + profession);
    }
}
