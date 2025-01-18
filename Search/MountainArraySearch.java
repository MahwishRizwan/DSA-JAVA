package Search;

public class MountainArraySearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        int result = findInMountainArray(arr, target);
        System.out.println("Index of the Target element is "+result);
    }

    public static int findInMountainArray(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] < arr[mid+1]){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return search(target, arr, start);
    }

    public static int search(int target, int arr[], int peak ){
        int firstTry = binarySearch(0, peak,arr, target);
        if(firstTry != -1){
            return firstTry;
        }
        else{
            return binarySearch(peak+1, arr.length-1,arr, target);
        }
    }

    public static int binarySearch(int low, int high, int[] arr, int target){
        int start = low;
        int end = high;
        boolean asc = arr[start] < arr[end];
        while(start<end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(asc){
                if(arr[mid] < target){
                start = mid + 1;
                }
                else{
                    end = mid -1;
                }
            }
            else{
                if(arr[mid] < target){
                start = mid - 1;
                }
                else{
                    end = mid +1;
                }
            }
        }
        return -1;
    }
    }

