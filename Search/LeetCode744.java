//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

//Input: letters = ["c","f","j"], target = "a"
//Output: "c"
//Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.

package Search;

public class LeetCode744 {
    public static void main(String[] args) {
    char[] letters = {'c','f','j'};
    char target = 'a';
    System.out.println(findSmallestLetterGreaterThan(letters, target));
    }

    public static char findSmallestLetterGreaterThan(char[] letters, char target) {
    int start = 0;
    int end = letters.length-1;
    while(start<=end){
        int mid = start + (end-start)/2;
        if(letters[mid]<=target){
            start = mid+1;
        }
        else{
            end = mid-1;
        }
    }
    return letters[start % letters.length];
    }
}
