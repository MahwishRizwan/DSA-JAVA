package Search;

public class CeilingOfNumberInArray {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;
        int result = findCeiling(arr, target);
        System.out.println("Ceiling of " + target + " in given array is " + result);
    }

    public static int findCeiling(int arr[], int target){
        int low  = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target){
                return arr[mid];
            }
            else if(arr[mid]<target){
                low = mid+1;
            }
            else{
                if(arr[mid-1]<target){
                    return arr[mid];
                }
                else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}
