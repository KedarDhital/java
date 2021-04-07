import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year to find out if it is a leap year");
        int input = sc.nextInt();

        if(( input % 4 == 0 & input % 100 != 0)||(input % 400 == 0)) {


            System.out.println("The " + input + " is a leap year");
        } else {
            System.out.println("It is not a leap year");

        }
    }
}
