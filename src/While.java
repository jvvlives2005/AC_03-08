/**
 * While loop with Alex Samuels
 * Created by c4q-joshelynvivas on 3/8/15.
 */
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        while (true) { //infinite loop: while(true)//
            System.out.println("Hello,world!");


            Scanner scanner = new Scanner(System.in);
            int x = 10;
            while (x < 100) {
                System.out.println("the number is " + x);
                System.out.println("what's another number?");
                x = scanner.nextInt();
            }

        }
    }
}