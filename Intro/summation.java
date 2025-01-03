package Intro;
import java.util.Scanner;

public class summation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the number to add and enter '=' to print result");
        while (true) {
            String n = sc.nextLine();
            if (n.equals("=")) {
                System.out.println("Sum: " + sum);
                break;
            } else {
                try {
                    sum += Integer.parseInt(n);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number or '=' to print result.");
                }
            }
        }
        sc.close();
    }
}