import java.util.Arrays;
import java.util.Scanner;

public class LoopsAndArrays {
    public static void main(String[] args) {
        //What is an array?
        int[] myArray = new int[7]; //Array creation way 1
        int[] myArray2 = {0,1,2,3,4}; //Array creation way 2
                        //0 1 2 3 4 <- indicies
        myArray[0] = 77;
        myArray[1] = 22;
        myArray[2] = 12;
        myArray[3] = -15;
        myArray[4] = 0;
        myArray[5] = 220;
        myArray[6] = 400;
        //System.out.println("Length: " + myArray.length);
        //System.out.println(Arrays.toString(myArray));
        //2D Arrays
        int[][] my2DArray = new int[5][5];
                                //rows //columns
        int[][] my2DArray2 = { //jagged array
            {1,2,3}, 
            {4,5,6,7}, 
            {8,9}
                        };
        //System.out.println(my2DArray2[1][3]);
        //For loops
        for (int i = 5; i > 0; i--) {
            //Can access "i" in here
            //System.out.println("iteration: " + i);

            //incrementation happens here (at end);
        }
        for (int i = 0; i < myArray.length; i++) {
            //0
            //1
            //2
            //3
            //4
            //5
            //6
            //System.out.println("At index " + i +", the value in myArray is: " + myArray[i]);
        }
        //Nested for loops
        for (int i = 0; i < my2DArray2.length; i++) {
            for (int j = 0; j < my2DArray2[i].length; j++) {
                //System.out.println(my2DArray2[i][j]);
            }
        }
        //While loops + break
        boolean isRunning = true;
        Scanner sc = new Scanner(System.in);
        while(isRunning) {
            System.out.println("Type something in to echo it, type \"q\" to quit"); 
            String input = sc.nextLine();
            if(input.equals("q")) {
                System.out.println("Exiting...");
                isRunning = false;
                break;
            }
            System.out.println("ECHO!: " + input);
        }
    }
}

