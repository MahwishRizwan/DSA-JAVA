import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        readArray(a, n);
        System.out.println(search(a));
        sc.close();
    }

    public static void readArray(int a[], int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        sc.close();
    }

    public static int search(int a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be searched");
        int n = sc.nextInt();
        sc.close();
        for(int i=0;i<a.length;i++){
            if(a[i] == n){
                return i;
            }
        }
        return -1;
        
    }

}
