public class Jagged2dArrayLinearSearch {
    public static void main(String args[]){
        int arr[][] = {
            {36, 47, 25, 61, 93, 15},
            {38, 55, 7},
            {31, 75, 94, 46, 78, 100, 92, 85, 19},
            {35, 48, 26, 82, 43, 63, 11}
        };
        int target = 43;

        System.out.println("The target element is present at the index "+search(arr, target));
    }

    public static int search(int arr[][], int target){
        for(int row = 0; row<arr.length; row++){
            for(int col =0; col<arr[row].length; col++){
                if(arr[row][col] == target){
                    return row*arr[row].length+col;
                }
            }
        }
        return -1;
    }
}
