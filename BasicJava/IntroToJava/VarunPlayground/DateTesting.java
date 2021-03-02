package VarunPlayground;

import java.util.Scanner;

public class DateTesting {
    public static void main(String[] args) {
        System.out.println(daysBetween("02/29/2020", "02/29/2024"));
    }
    public static int daysBetween(String day1, String day2){
        int[] dim = {31,28,31,30,31,30,31,31,30,31,30,31};
        int ret_val = -1;
        boolean valid = true;
        Scanner scan1 = new Scanner(day1);
        Scanner scan2 = new Scanner(day2);
        try{
            ret_val = 0;
            scan1.useDelimiter("/");
            int month1 = scan1.nextInt();
            int date1 = scan1.nextInt();
            int year1 = scan1.nextInt();
            scan2.useDelimiter("/");
            int month2 = scan2.nextInt();
            int date2 = scan2.nextInt();
            int year2 = scan2.nextInt();
            if(dim[month1-1] < date1) {
                if((month1 == 2) && (year1%4 == 0 && year1%100 != 0) && (date1 == 29)) {} else throw new Exception();
            }
            if(dim[month2-1] < date2) {
                if((month2 == 2) && (year2%4 == 0 && year2%100 != 0) && (date2 == 29)) {} else throw new Exception();
            }
            for (int i = year1; i < year2; i++) {
                if(i%4 == 0 && i % 100 != 0) {
                    ret_val += 366;
                } else {
                    ret_val += 365;
                }
            }
            int s = month1;
            for (int i = 0; i < month2-month1; i++) {
                if(s==2 && (year2%4 == 0 && year2%100 != 0)) ret_val++;
                ret_val += dim[s-1];
                s++; 
            }
            ret_val += (date2-date1);
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Invalid Input!");
        }
        return ret_val;
    }
}
