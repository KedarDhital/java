import java.util.Random;
import java.util.Scanner;

public class SentinelExample {
    public static void main(String[] args) {
        // Random rd = new Random();
        Scanner in = new Scanner(System.in);
        int input = 0;
        while (input >= 0 ) {

            int v = (int) (Math.random() * 100);

            //   System.out.println("randome number is " +v);

            int s = (int) (Math.random() * 100);
            //  System.out.println("Another random is " + s);

            System.out.println("What is the sum of " + v + " and " + s);
             input = in.nextInt();


            if (input == s + v) {
                System.out.println("You are correct");

            } else {
                System.out.println("You are incorrect");

            }
        }
    }
}