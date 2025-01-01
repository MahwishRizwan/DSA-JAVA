//Given an array nums of integers, return how many of them contain an even number of digits.
//Input: nums = [12, 345, 2, 6, 7896]
//Output: 2

public class EvenNumberInArray {  
    public static void main(String args[]){
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int nums[]){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    public static boolean even(int num){
        int numberOfDigits = digits(num);
        if(numberOfDigits%2==0){
            return true;
        }
        return false;
    }

    public static int digits(int num){
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }
}
