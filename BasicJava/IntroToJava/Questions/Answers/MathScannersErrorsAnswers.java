package Questions.Answers;

import java.util.Scanner;

public class MathScannersErrorsAnswers {
    public static void main(String[] args) {
        //Information Splicer
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your first name?");
        String fn = sc.nextLine();
        System.out.println("What is your last name?");
        String ln = sc.nextLine();
        System.out.println("What is your b-day? MM/DD/YYYY");
        String bd = sc.nextLine();
        Scanner splitter = new Scanner(bd);
        splitter.useDelimiter("/");
        int m = splitter.nextInt();
        int d = splitter.nextInt();
        int y = splitter.nextInt();
        String monthString = "";
        switch(m) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
        }
        String addOn = "th";
        switch (d) {
            case 1:
                addOn = "st";
                break;
            case 2:
                addOn = "nd";
                break;
            case 3:
                addOn = "rd";
                break;
            case 21:
                addOn = "st";
                break;
        }
        System.out.println("Your name is " + fn + " " + ln + ". You were born on the " + d + addOn + " of " + monthString + " in " + y);
        */
        //Basic Deriver
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a function in the form C*x^n"); //0.5*x^7 -> 3.5*x^6
        String readIn = sc.nextLine();
        Scanner splitter = new Scanner(readIn);
        splitter.useDelimiter("\\*");
        try {
            double coeff = splitter.nextDouble();
            splitter.useDelimiter("\\^");
            splitter.next();
            double pow = splitter.nextDouble();
            double newC = coeff*pow;
            pow = pow - 1;
            System.out.println("Derivation: " + newC + "x^" + pow);
        } catch (Exception e) {
            System.out.println("Invalid format");
        }
        */
        //Place Shifter
        Scanner sc = new Scanner(System.in);
        System.out.println("Your number?");
        try {
            
            int n = sc.nextInt();

            int a, b, c, d, e, f;
            //123450 + 6 = 123456
            //123456/10 = 12345.6 -> 12345 (NO ROUNDING) - truncation
            //12340 + 5 
            //1234.56 1230 + 4
            f = n % 10;
            e = (n/10) % 10;
            d = (n/100) % 10;
            c = (n/1000) % 10;
            b = (n/10000) % 10;
            a = (n/100000) % 10;

            if(a < 9) {
                a++;
            }
            if(b < 9) {
                b++;
            }
            if(c < 9) {
                c++;
            }
            if(d < 9) {
                d++;
            }
            if(e < 9) {
                e++;
            }
            if(f < 9) {
                f++;
            }
            System.out.println(a + "" + b + "" + c + "" + d + "" + e + "" + f);
        } catch(NumberFormatException nfe) {
            System.out.println("Invalid input");
        }
    }
}
