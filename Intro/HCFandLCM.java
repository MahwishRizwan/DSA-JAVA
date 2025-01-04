package Intro;

import java.util.Scanner;

public class HCFandLCM{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number to find their HCF and LCM");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("HCF of "+a+" and "+b+" is "+HCF(a,b));
		System.out.println("LCM of "+a+" and "+b+" is "+LCM(a,b));
	}
	
	public static int HCF(int a, int b){
		while(b!=0){
			int temp = b;
			b = a%b;
			a=temp;
		}
		return a;
	}
	
	public static int LCM(int a, int b){
		return (a*b)/HCF(a,b);
	}
}