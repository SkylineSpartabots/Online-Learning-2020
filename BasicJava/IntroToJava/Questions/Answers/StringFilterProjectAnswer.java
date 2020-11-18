package Questions.Answers;

public class StringFilterProjectAnswer {
    public static void main(String[] args) {
        String s = "a0b_java_z";
        
        boolean a, b, c, d, e;
        a = false;
        b = false;
        c = false;
        d = false;
        e = false;

        if(s.startsWith("a") && s.endsWith("z")) {
            a = true;
            System.out.println("A");
        }
        if(s.charAt(2) == 'b') {
            b = true;
            System.out.println("B");
        }
        if(s.contains("code") || s.contains("java")) {
            c = true;
            System.out.println("C");
        }
        if(!s.contains("e")) {
            d = true;
            System.out.println("D");
        }
        if(s.length() > 6 && s.length() < 12) {
            e = true;
            System.out.println("E");
        }
        if(a && b && c && d && e) {
            System.out.println("F");
        }

        //Create a program that sorts strings into 6 buckets:
            /*
                A - Starts with 'a' and ends with 'z'
                B - Has the letter 'b' at index 2
                C - Contains the word "code" OR "java" within it
                D - Does not contain the vowel 'e'
                E - Has a length of over 6 AND below 12
                F - Is in all other buckets
            */
        //It should print out ALL the buckets a string belongs to (Ex. abb_code_z) would be in A B C and E.
    }
}
