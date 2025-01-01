// https://leetcode.com/problems/richest-customer-wealth/description/

// You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

//A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

// Input: accounts = [[1,2,3],[3,2,1]]
// Output: 6

public class RichestCustomerWealth{
    public static void main(String args[]){
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int accounts[][]){
        int maxWealth = 0;

        
        
        for (int money = 0; money<accounts.length; money++){
            int sum = 0;
            for (int bank = 0; bank<accounts[money].length; bank++){
                sum += accounts[money][bank];
            }
            if (sum > maxWealth){
                maxWealth = sum;
            }
        }
        
        return maxWealth;
    }
}