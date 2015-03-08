/**
 * Created by c4q-joshelynvivas on 3/8/15.
 */
public class Counter {
    public static void main(String[] args){
        //int counter = 10;
        //while (counter >= 10) {
        //    System.out.println(counter);
        //    counter = counter - 5;
        // }

        int counter = 100;
        while (counter >= 1) {
            System.out.println(counter);
            if (counter > 10) {
                counter -= 5;
            }
            else {
                counter -= 1;
            }
        }
        System.out.println("Blastoff!");
        }

}
