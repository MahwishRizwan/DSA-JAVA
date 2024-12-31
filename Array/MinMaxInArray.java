public class MinMaxInArray {
    public static void main(String args[]){
        int arr[] = {
            6, 96, 67, 45, 80, 46, 2, 66, 55, 10
        };
        System.out.println("Maximum element in the array is "+max(arr));
        System.out.println("Minimum element in the array is "+min(arr));
    }

    public static int max(int arr[]){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int min(int arr[]){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
