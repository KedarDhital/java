public class LoopsExercise {
    public static void main(String[] args) {
        /*
        Write a program that uses a for-loop to loop through the numbers 1-10 and prints out each number.
         */
        for( int i = 1; i<=10; i++){
             System.out.println(i);
       }
         /*
         Write a program that uses a while loop to loop through the numbers 0-100 in increments of 10 and prints out each number.
          */

       int nums = 0;
        while (nums < 100){
            nums = nums + 10;
            System.out.println(nums);
        }
        /*
        Write a program that uses a do-while-loop to loop through the numbers 1-10 and prints out each number.

         */
      int num3 = 0;
       do {
         num3 = num3 + 1;
            System.out.println(num3);
        }while (num3 < 10);

        /*
        Write a program that uses a for-loop to loop through the numbers 1-100.
        Print out each number if is a multiple of 5, but do not print out any numbers
        between 25 and 75. Use the “continue” statement to accomplish this.
         */
        int num4 = 0;
        for( int i = 0 ; i < 100; i++){
            num4 = num4+1;
            if( num4 % 5 == 0){ // && !(num4 >= 25 && num4 <=75)){
                if(num4 >=25 && num4 <=75) {
                    continue;
                }
                System.out.println(num4);

            }
        }
        /*
        Write a program that uses a for-loop to loop through the numbers 1-100.
        Print out each number if is a multiple of 5, but do not print out any numbers
         greater than 50. Use the “break” keyword to accomplish this.
         */

        int nusi = 0;
        for( int i = 0; i < 100; i++ ){
            nusi++;
            if( nusi % 5 == 0){
                if(nusi >= 50){
                    break;
                }
                System.out.println(nusi);
            }
        }
         /*
         Write a program that uses nested for-loops to output the following:
            Week 1:

           Day 1  Day 2  Day 3 Day 4 Day 5

            Week 2: Day 1 Day 2 Day 3 Day 4 Day 5
        */
        int week = 0;
        int day = 0;
        for(int i =0; i < 2; i++){
            week++;
            System.out.println();
            System.out.println("Week " + week);
            for( int j = 0; j<5; j++){
                day++;
                System.out.println("Day: " + day);
               // System.out.println();

            }

        }
    }

}
