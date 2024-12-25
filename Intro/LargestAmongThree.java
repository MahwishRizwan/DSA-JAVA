package Intro;

import java.util.Scanner;

public class LargestAmongThree {

    public void findLargestMethod1(int a, int b, int c){
        if(a>=b && a>=c){
            System.out.println(a+" is the largest number");
        }
        else if(b>=a  &&  b>=c){
            System.out.println(b+" is the largest number");
        }
        else{
            System.out.println(c+" is the  largest number");
        }
    }

    public void findLargestMethod2(int a, int b, int c){

        int max = a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max = c;
        }

        System.out.println(max+" is the largest number");

    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers to find largest among them");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        sc.close();

        LargestAmongThree obj = new LargestAmongThree();

        obj.findLargestMethod1(a, b, c);
        
        obj.findLargestMethod2(a, b, c);
    }
    
}
