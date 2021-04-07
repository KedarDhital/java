import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExercise {
    public static void main(String[] args) {

        /*
   Write a program that creates an array of integers with a length of
    3. Assign the values 1, 2, and 3 to the indexes. Print out each array element.

         */

//        int[] myArray = new int[]{1, 2, 3};
//        for (int array : myArray) {
//            System.out.print("[" + array + "] ");
//
//        }
        /*
     Write a program that returns the middle element in an array.
     Give the following values to the integer array: {13, 5, 7, 68, 2}
      and produce the following output: 7
         */

//        int[] myarray1 = new int[]{13, 5, 7, 68, 2, 10, 12};
//        int index = myarray1.length / 2;
//        System.out.println();
//        System.out.println(myarray1[index]);
/*
Write a program that creates an array of String type and initializes it with the strings
“red”, “green”, “blue” and “yellow”. Print out the array length. Make a copy using the clone( )
method. Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
 */
//        String[] colors = new String[]{"red","green","blue", "yellow"};
//        System.out.println(colors.length);
//        String[] cloneColors = colors.clone();
//        System.out.println(Arrays.toString(cloneColors));
//        System.out.println(Arrays.toString(colors));
        /*
        Write a program that creates an integer array with 5 elements (i.e., numbers).
        The numbers can be any integers.
        Print out the value at the first index and the
         last index using length - 1 as the index. Now try printing the
         value at index = length ( e.g., myArray[myArray.length ] ).
         Notice the type of exception which is produced. Now try to assign a value to the array index 5.
         You should get the same type of exception.

         */

//        int[] ram = {1,3,4,5,6};
//        System.out.println(ram[0]);
//        System.out.println(ram[ram.length-1]);
//       //  System.out.println(ram[5]);
/*
Write a program where you create an integer array with a length of 5.
Loop through the array and assign the value of the loop
 control variable (e.g., i) to the corresponding index in the array.

 */
//        int[] integerArray = new int[5];
//
//        for(int i = 0 ; i <integerArray.length -1; i++){
//            integerArray[i] = i;
//            System.out.println(integerArray[i]);
//
//        }
/*
Write a program where you create an integer array of 5 numbers.
Loop through the array and assign the value of the loop control variable multiplied by 2
 to the corresponding index in the array.

 */

int[] arrayex = new int[5];
for(int i = 0 ; i<arrayex.length; i++){
    arrayex[i] = i * 2;
   System.out.println(arrayex[i]);
}
        System.out.print(Arrays.toString(arrayex));
/*
Write a program where you create an array of 5 elements. Loop through the array
and print the value of each element, except for the middle (index 2) element.

 */

        int[] rums = new int[]{1,2,3,4,5};

        for(int i=0;i<rums.length;i++){
            if (rums[i] == 3){
                continue;
            };
            System.out.println();
            System.out.println("s "+rums[i]);

        }

/*
Write a program that creates a String array of 5 elements and swaps the first element with the middle element
 without creating a new array.

 */
String[] stringArray = new String[5];
        stringArray[0] = "Green";
        stringArray[1] = "Blue";
        stringArray[2] = "Orange";
        stringArray[3] = "Pink";
        stringArray[4] = "Brown";

        for (String stringArrays : stringArray) {
            System.out.println(stringArrays);
        }





















    }

}

