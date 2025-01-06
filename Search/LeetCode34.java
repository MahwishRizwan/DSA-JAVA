//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

//If target is not found in the array, return [-1, -1].

//You must write an algorithm with O(log n) runtime complexity.

//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]

package Search;

public class LeetCode34 {
    public static void main(String[] args) {
        int [] nums = {5,7,7,8,8,10};
        int target = 8;
        int [] result = searchRange(nums, target);
        System.out.println("["+result[0]+","+result[1]+"]");
    }

    public static int[] searchRange(int[] nums, int target) {
        int start = findFirst(nums, target);
        int end = findLast(nums, target);
        return new int[]{start, end};
    }

    private static int findFirst(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int position = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                position = mid;
                end = mid - 1;
            }
            else if (nums[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return position;
    }

    private static int findLast(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int position = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                position = mid;
                start = mid + 1;
            }
            else if (nums[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return position;
    }
}