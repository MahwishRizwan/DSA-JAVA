import java.util.ArrayList;
import java.util.Scanner;
public class LinearSearchString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to be searched from");
        String str = sc.nextLine();
        System.out.println("Enter the charcter to be searched for");
        char s = sc.next().charAt(0);
        search(str, s);
        sc.close();
    }

    public static void search(String str, char ch){
        ArrayList<Integer> arr = new ArrayList<>();
        boolean found = false;
        for(int i = 0; i< str.length(); i++){
            if(str.charAt(i) == ch){
                arr.add(i);
                found = true;
            }
        }

        if(found == true){
            System.out.println("The char "+ch+" is present in the following indeces of the string.");
            System.out.println(arr);
        }
        else{
            System.out.println("The char "+ch+" is not present in the string.");
        }
        
    }
}
