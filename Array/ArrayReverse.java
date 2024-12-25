public class ArrayReverse {
    public void swap (int[] arr) {
        for(int i = 0; i<arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        ArrayReverse ar = new ArrayReverse();
        int[] arr = {1, 2, 3, 4, 5};
        ar.swap(arr);
        ar.printArray(arr);
    }

}
