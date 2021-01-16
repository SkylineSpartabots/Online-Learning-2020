import java.util.Arrays;
import java.util.Random;

public class MethodsOverloadingReturns {
    public static int changeable;
    public static void main(String[] args) {
      //Methods are like factories
      /*
      one output (always) but can have 0 - infinity inputs
        Input, Output
        Input, no output
        no Input, output
        no input, no output
        String s = "myString";
        s.charAt(3);
      */
      int[] unSummed = {1, 5, 9, 220, 3};
      int returnedSum = example1(new int[] {1, 5, 9, 220, 3});
      example2("Varun", 77);
      double[] myd = new double[10];
      myd = example3();
      System.out.println(Arrays.toString(myd));

      System.out.println(changeable);
      example4();
      System.out.println(changeable);
    }
    //Sections of a method:
    //visibility modifier (private or public)
    //static or non static (as of now, always choose static)
    //return type (any object or primitive OR void (void means nothing -> return no value))
    //method name (ex. calculateSum)
    //parameters (ex. (String s, int beginInt, int[] intArr))
    //body (where the code goes)

    //Template method
    /*
    public/private static [return_type] [name_of_method] ([primitive] [primitiveName], [Object] [objectName]) {

    }
    */
    //Returning rules
    public static int example1(int[] arr) { //sumArr
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static double example1(double[] arr) { //sumArr
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void example2(String s, int repNum) { //copyString
        for (int i = 0; i < repNum; i++) {
            System.out.print(s);
        }
    }

    public static double[] example3() { //populateRandom
        Random r = new Random();
        double[] populatedArr = new double[10];
        for (int i = 0; i < populatedArr.length; i++) {
            populatedArr[i] = r.nextDouble();
        }
        return populatedArr;
    }

    public static void example4() { //randomVar
        changeable = new Random().nextInt();
    }
}
