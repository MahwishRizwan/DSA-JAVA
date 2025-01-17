//Finding peak index in a mountain array
//https://leetcode.com/problems/peak-index-in-a-mountain-array/

package Search;

public class LeetCode852 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 6, 4, 2};
        System.out.println("Index of the peak element in the array is "+peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length;
        while(start< end){
            int mid = start + (end - start) / 2;
            if(arr[mid]<arr[mid+1]){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }
}
