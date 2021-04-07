import java.util.Scanner;

public class ControlFlowExercise {
    public static void main(String[] args) {
        /*
        Write a program that declares 1 integer variable x, and then assigns 7 to it
        Write an if statement to print out “Less than 10” if x is less than 10.
         Change x to equal 15 and notice the result
         (console should not display anything).
         */

        int x = 7;
        if (x < 10) {
            System.out.println(x + " is less than 10");
        }
        /*
        Write a program that declares 1 integer variable x, and then assigns 7 to it
        . Write an if-else statement that prints out “Less than 10”
         if x is less than 10 and “Greater than 10” if x is greater than 10.
         Change x to 15 and notice the result.
         */
        int y = 7;
        if (y < 10) {
            System.out.println(y + " is less that 10");

        } else
            System.out.println(y + " is greater than 10");


     /*
     Write a program that declares 1 integer variable x, and then assigns 15 to it.
      Write an “if-else-if” statement that prints out “Less than 10” if x is less than 10,
      “Between 10 and 20” if x is greater than 10 but less than 20, and “Greater than or
      equal to 20” if x is greater than or equal to 20. Change x to 50 and notice the result.
      */
        int z = 15;
        if(z < 10){
            System.out.println(z +" is less than 10 ");
        }else if(z > 10 && z < 20){
            System.out.println("Between 10 and 20");
        } else if (z >= 20){
            System.out.println("is greater than or equal to 20");

    }
        /*
        Write a program that declares 1 integer variable x, and then assigns 15 to it.
        Write an if-else statement that prints “Out of range” if the number is less than
         10 or greater than 20 and prints “In range” if between 10 and 20
         (including equal to 10 or 20). Change x to 5 and notice the result.
         */
        int c = 15;
        if( c <10 && c > 20) {
            System.out.println("Out of range");
        }    else if (c >= 10 || c <=20 ) {
            System.out.println("in Range");

        }
        /*
       Write a program that uses if-else-if statements to print out grades A, B, C, D, F
       according to the following criteria:
        A: 90-100

        B: 80-89

        C: 70-79

        D: 60-69

        F: <60

        Use the Scanner class to accept a number score from the user to determine the letter grade.
        Print out “Score out of range.” if the score is less than 0 or greater than 100.
                 */
        Scanner ins = new Scanner(System.in);
        System.out.println("Please enter your grade");
        int grade = ins.nextInt();

        if(grade >= 90 && grade <=100) {
            System.out.println("Grade A, Good job");

        }  else if( grade <= 89 && grade >= 80){
            System.out.println("Grade B, try harder next time to get grade A");

            } else if(grade <= 79 && grade >= 70) {
            System.out.println(" Grade C, You passed but try harder to obtain A or B grade next time");
        } else if ( grade <= 69 && grade >= 60) {
            System.out.println(" grade D");
        } else if(grade < 60 && grade >= 1){
            System.out.println(" Grade F, you failed, better luck next time");

        } else if (grade == 0 || grade >= 101) {
            System.out.println("Score out of range");

        }

/*
Write a program that accepts an integer between 1 and 7 from the user.
Use a switch statement to print out the corresponding weekday. Print “Out of range” if the number is
less than 1 or greater than 7. Don’t forget to include “break” statements in each of your cases.
 */

        Scanner scs = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 7");
        int ss = scs.nextInt();

        switch (ss){
            case 1:
                System.out.println("Sunday");
                break;
            case 2: System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Out of range");


        }

























        }

}