package Search;

public class ElementPositionInInfiniteArray {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 6, 7, 8, 10, 11, 12, 15, 20, 23, 30};
        int target = 15;
        System.out.println("Target element is present at index " +search(arr, target));
    }

    public static int search(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while(target> arr[end] && end < arr.length){
            int newStart = end + 1;
            end = Math.min( end + (end - start + 1) * 2 , arr.length-1);
            start = newStart;
            
        }
        
        return binarySearch(arr, target, start, end);
    }

    public static int binarySearch(int arr[], int target, int start, int end){
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }
            else if(target < arr[mid]){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
