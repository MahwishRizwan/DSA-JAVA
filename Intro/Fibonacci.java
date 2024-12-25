package Intro;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of terms for the Fibonacci sequence:");
        int n = sc.nextInt();

        sc.close();

        if(n<=0){
            System.out.println("Enter a number greater than 0");
        }
        else {
            int a =0;
            int b = 1;
            System.out.println("Fibonacci Sequence");
            for(int i=1; i<=n; i++){
                System.out.print(a+" ");
                int temp = a;
                a = b; 
                b= temp+a;
            }
        }
    }
}
