import java.util.Scanner;

public class HexaDecimal {
    public static void main(String[] args) {

        /*
        Write a program that converts a hexadecimal number into a decimal value.

        Input:  Hexadecimal Digit (any value composed of digits 0-9,A-F)
        Output:  Decimal Value

        Hint:  Integer.parseInt has an overload that accepts a 2nd parameter, radix.
         */
       /* String hex = "9";
        int decimal = Integer.parseInt(hex ,16);
        System.out.println(decimal);*/

        // Write a program that asks user to enter a number
        // and find out if that number is divisible by 2 and/or 3

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number to check if it is divisible by 2 and or 3");
        int input = sc.nextInt();

        if(input %2 == 0) {//|| (input % 3 == 3)){
            System.out.println("The number is  divisible by 2");

        } else{
            System.out.println("The number is not divisuable by 2");
        }

    }
}
