package Intro;

import java.util.Scanner;

public class prime {
    public boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for (int i =2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        prime p = new prime();
        System.out.println("Enter the number to check for prime");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(p.isPrime(n)){
            System.out.println("The no "+n+" is a prime number");
        }
        else{
            System.out.println("The no "+n+" is not a prime number");
        }
        
        sc.close();
    }
}
