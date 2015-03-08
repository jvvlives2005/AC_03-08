/**
 * Created by c4q-joshelynvivas on 3/8/15.
 */
import java.util.Scanner;

public class Emoticons {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How do you feel?");
        String emoticon = keyboard.nextLine();
        if(emoticon.equals(":)") || emoticon.equals("happy") || emoticon.equals(":]")){  //no need to have curly brackets//
            System.out.println("Today you're happy.");
        }
        else if(emoticon.equals(":(")){
            System.out.println("Today you're sad.");
        }
        else{
            System.out.println("So how are you feeling?");
        }

        //Shortcut//
        System.out.println("How do you feel?");
        String okies = keyboard.nextLine();

        String emotion;
        if(okies.equals(":)") || okies.equals("happy") || okies.equals(":]")){
            emotion = "happy";
        }
        else if(okies.equals(":(")){
            emotion = "sad";
        }
        else {
            System.out.println("I don't know that one.");
            return;
        }

        System.out.println("You're " + emotion + ",");

    }
}
