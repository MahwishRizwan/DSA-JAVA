import java.util.Scanner;

public class MaxElement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n]; 
        read(arr, n);
        findGreatest(arr, n);
        print(arr, n);
        sc.close();

    }

    static void read(int arr[], int n){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            System.out.println("Enter the element at index " + i);
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    static int findGreatest(int arr[], int n){
        int max = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static void  print(int arr[], int n){
        System.out.println("The greatest element of the Array is "+findGreatest(arr, n));
    }

}
