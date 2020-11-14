import java.util.ArrayList;
import java.util.Arrays;

public class ModifiersAndBooleanLogic {
    public static int everyoneCanSee = 0;
    private static int onlyThisClassCanSee = 1;

    protected static int outsidePackageVisibleToExtendedClass = 2;
    static int onlyInsidePackageVisibleToExtendedClass = 3; //package protected
    //Don't worry too much about these^^^  :)

    public static void main(String[] args) {
        //Some things I forgot - - - comments!
        //What is a scope?
        //What is static? -> Belonging to this class
        //Booleans and if statements, else ifs
            //Boolean operations
            //PRACTICE
            //Quick note: switch case
        
        //Important String Methods! (returns basically means "spits out a ___")
            //What are parameters?
            //The power of autocomplete
            /*
                equals - are the strings equal to eachother? (Takes in anything, returns a boolean)

                equalsIgnoreCase - ^^^ but without caring about case (Takes in anything, returns a boolean)

                length - returns the length of the string, first letter is considered 1 (Takes in nothing, returns an int) 

                contains - Does the string contain this substring (Takes in a string, returns a boolean)

                charAt - returns the character at an index, first letter is 0 (Takes in an int, returns a char)

                indexOf - gives you the index of the first occurrence of the letter given (Takes in a char, returns an int)
                    (has a fromIndex flavor)

                lastIndexOf - gives you the last index of given character/string (Takes in a char, returns an int)
                ^^^ for the previous two, when you give a string parameter, 
                    it will tell you the index of the start letter of the given string

                substring - gives you the string from the given indices, including first, excluding last (Takes in two nts, returns a string)

                replace - replaces all of given char or charsequence and by extension a String, in string (Takes in char or string, returns string)

                replaceFirst - replaces only first instance of char/str (Takes in char or string, returns string)

                endsWith - does String end with char? (Takes in char, returns a boolean)

                startsWith - does String start with char? (Takes in char, returns a boolean)

                toUpperCase - Returns uppercase (Takes in char or string, returns string)

                toLowerCase - Returns lowercase (Takes in char or string, returns string)
            */
        //Basic comparators with ints < > ==
        int a = 14;
        int b = 14;
        int c = 17;
        if((b >= a) || b < 10) {
            System.out.println("ndsjbcdhjc");
        }
        String s = "!AaBbCc Test ExampleStringB!";
        System.out.println();
    }
}