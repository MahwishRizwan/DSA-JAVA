public class LinearSearchIn2DArray{
    public static void main(String[] args) {
        int arr[][] = {
            {71, 22, 20},
            {24, 70, 64},
            {26, 61, 34}
        };

        int target = 70;

        System.out.println("Element present at index "+search(arr, target));
    }

    public static int search(int arr[][], int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return i*arr[i].length+j;
                }
            }
        }
        return -1;
    }
}
