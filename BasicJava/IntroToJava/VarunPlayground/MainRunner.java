package VarunPlayground;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.DoubleSupplier;

public class MainRunner {
    public static void main(String[] args) {
        /*
        TestingClass t = new TestingClass(5);
        TestingClass x = new TestingClass(7);
        TestingClass a = new TestingClass(4);
        TestingClass b = new TestingClass(5);
        ArrayList<TestingClass> tcRunner = new ArrayList<>(Arrays.asList(t,x,a,b));
        HashMap<Character, Integer> myMap = new HashMap<>();
        for(Map.Entry<Character, Integer> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        tcRunner.forEach((v) -> v.run());

        String s = "Skyline Spartabots";
        s.chars().forEach(o -> {
            if(!myMap.containsKey((char)o)) {myMap.put((char)o, 0);};
            myMap.put((char)o, myMap.get((char)o)+1);
        });
        for(Map.Entry<Character,Integer> z : myMap.entrySet()) {
            System.out.println((z.getValue() > 1) && (!z.getKey().equals(' '))? (z.getKey() + ":" + z.getValue()): z.getKey() + ": too few");
        }
        
        Converter plusTwenty = b -> {
            double[] ret_val = new double[b.length];
            for (int i = 0; i < b.length; i++) {
                ret_val[i] = b[i] + 20;
            }
            return ret_val;
        };
        System.out.println(Arrays.toString(plusTwenty.convert(5, 3, 4, 6, 5, 6, 4, 3, 2, 1)));
        
        for (int i = 0; i < 20; i++) {
            double randDouble = Math.random(); 
            System.out.print(randDouble + " : ");
            int randInt = (int)Math.round(randDouble * 100);
            System.out.println(randInt + ", ");
        }
        */
        byte[] byteArr = {127,0,0,0,0,0,0,0,0,0,0};
        BigInteger bi = new BigInteger(byteArr);
        System.out.println(bi);
    }
}
