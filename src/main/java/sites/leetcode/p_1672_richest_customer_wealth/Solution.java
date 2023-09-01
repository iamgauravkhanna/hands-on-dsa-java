package sites.leetcode.p_1672_richest_customer_wealth;

public class Solution {

    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3, 9}, {3, 2, 1, 11}, {3, 24, 1, 9}, {3, 2, 1, -100}};

        int maximumWealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            int currentWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                currentWealth += accounts[i][j];
            }
            maximumWealth = Math.max(maximumWealth, currentWealth);
        }

        System.out.println("Maximum Wealth :: " + maximumWealth);
    }
}
