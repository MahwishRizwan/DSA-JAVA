package Search;

public class OrderAgnosticBS {
    public static void main(String args[]){
        int arr[] = {1, 4, 8, 12, 24, 27, 36, 39};
        int target = 12;
        System.out.println("The target element is present at index " +search(arr, target));
    }

    public static int search(int arr[], int target){
        int low = 0;
        int high = arr.length - 1;
        boolean asc = arr[low]<arr[high];
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(asc){
                if(arr[mid] < target){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }else{
                if(arr[mid] < target){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
}
