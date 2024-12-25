package Intro;

import java.util.Scanner;

public class Armstrong {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Armstrong arm = new Armstrong();

        System.out.println("Enter a number to check weather it,s Armstrong or not");
        int num = sc.nextInt();

        arm.checkArmstrong(num);
        sc.close();
    }

    public int calArmstrong(int num){

        int digit = String.valueOf(num).length();

        int sum = 0;

        int originalNumber = num;
        
        while(originalNumber>0){

            int rem = originalNumber%10;
            sum = sum + (int)Math.pow(rem,digit);
            originalNumber = originalNumber/10;
        }
        return sum;
    }

    public void checkArmstrong(int num){

        int sum = calArmstrong(num);
        if(num == sum){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not an Armstrong Number");
        }
    }
}
