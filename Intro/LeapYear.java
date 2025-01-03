//Input a year and find whether it is a leap year or not.
package Intro;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year to check for Leap year:");
        int year = sc.nextInt();
        checkLeapYear(year);
    }

    static void checkLeapYear(int year) {
        if((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.println(year+" is a leap year.");
        }
        else{
            System.out.println(year+" is not a leap year.");
        }

    }
}
