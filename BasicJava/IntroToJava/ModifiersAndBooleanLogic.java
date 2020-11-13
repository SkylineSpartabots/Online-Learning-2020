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
                equals - are the strings equal to eachother?

                equalsIgnoreCase - ^^^ but without caring about case

                length - returns the length of the string (first letter is considered 1)

                contains - Does the string contain this substring

                charAt - returns the character at an index (first letter is 0)

                indexOf - gives you the index of the first occurence of the letter given 
                    (has a fromIndex flavor)

                lastIndexOf - gives you the last index of given character/string
                ^^^ for the previous two, when you give a string parameter, 
                    it will tell you the index of the start letter of the given string

                substring - gives you the string from the given indicies (including first, excluding last)

                replace - replaces all of given char (or charsequence and by extension a String) in string

                replaceFirst - replaces only first instance of char/str

                endsWith - does String end with char?

                startsWith - does String start with char

                toUpperCase - Returns uppercase

                toLowerCase - Returns lowercase
            */
        String s = "!AaBbCc Test ExampleString!";
        System.out.println();
    }
}