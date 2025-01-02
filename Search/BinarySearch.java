package Search;
public class BinarySearch {
    public static void main(String args[]){
        int[] arr = {1, 23, 45, 51, 75, 87, 89, 90, 97};
        int target = 89;
        System.out.println("The target element is present at index " + search(arr, target));
    }

    public static int search(int arr[], int target) {
        
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start +(end-start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
