package Intro;

import java.util.Scanner;

public class CaseCheck{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char a = sc.next().trim().charAt(0);
        sc.close();

        if(a>='a' && a<='z'){
            System.out.println("Charcter in lower case");
        }
        else if(a>='A' && a<='Z'){
            System.out.println("Character in upper case");
        }
        else{
            System.out.println("Character is neither in upper or lower case");
        }

    }
    
}
