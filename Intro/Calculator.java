package Intro;

import java.util.Scanner;

public class Calculator {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int result = 0;

        System.out.println("Enter number");
        int a = sc.nextInt();

        result = a;

        while(true){
            System.out.println("Enter opeartor or press x to exit");
            char op = sc.next().charAt(0);

            if(op == 'x' || op == 'X'){
                break;
            }else if(op== '+'  || op == '-' ||  op == '*' || op == '/' || op == '%'){
                System.out.println("Enter number");
                int b = sc.nextInt();
                switch (op) {
                    case '+':
                        result = result +b;
                        System.out.println("result "+result);
                        break;
    
                    case '-':
                        result = result - b;
                        System.out.println("result "+result);
                        break;
    
                    case '*':
                        result = result * b;
                        System.out.println("result "+result);
                        break;
    
                    case '/':
                    if(b!=0){
                        result = result / b;
                        System.out.println("result "+result);
                    }else{
                        System.out.println("Undefined");
                        System.exit(0);
                    }
                    break;
    
                    case '%':
                        result = result % b;
                        System.out.println("result "+result);
                        break;
                    default:
                        break;
                }
            }else{
                System.out.println("Invalid operator");
            }
        }
        sc.close();
    }
}