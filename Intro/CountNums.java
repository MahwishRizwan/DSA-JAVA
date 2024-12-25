package Intro;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

        System.out.println("Enter the digit whose occurance you would like to check");
        int d = sc.nextInt();

        sc.close();

        int count = 0;

        while(n>0){
            int rem = n%10;
            if(rem == d){
                count++;
            }
            n = n/10;        }

        System.out.println(d+" has occured "+count+" times");
    }    
}
