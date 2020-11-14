package VarunPlayground;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MainRunner {
    public static void main(String[] args) {
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
    }
}
