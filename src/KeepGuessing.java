/**
 * Created by c4q-joshelynvivas on 3/8/15.
 */
import java.util.Scanner;
import java.util.Random;

public class KeepGuessing {
    public static void main(String[] args){
        System.out.println("I have chosen a number between 1 and 10. Try to guess it");
        Scanner scanner = new Scanner (System.in);
        Random random = new Random();
        int number = random.nextInt(10) + 1;
        while(number > 0){
            System.out.print("Your guess: ");
            int guess = scanner.nextInt();
            if (guess == number){
                System.out.println("That's right! You're a good guesser");
                break;
            }
            else if (guess < number) {
                System.out.println("That is incorrect. Guess higher");
            }
            else if (guess > number) {
                System.out.println("That is incorrect. Guess lower");
            }
            else {
                return;
            }




        }







    }



}
