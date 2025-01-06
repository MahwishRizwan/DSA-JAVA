package Search;

public class FloorOfNumberInArray {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 9, 14, 16, 18};
        int target = 10;
        if(target<arr[0]){
            System.out.println("No element is smaller than "+target);
            return;
        }
        int result = findFloor(arr, target);
        System.out.println("Floor of " + target + " in the given array is " + result);
    }

    public static int findFloor(int arr[], int target) {
        int start = 0;
        int end = arr.length -1;
        while(start <=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return arr[mid];
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return arr[end];
    }
    
}
