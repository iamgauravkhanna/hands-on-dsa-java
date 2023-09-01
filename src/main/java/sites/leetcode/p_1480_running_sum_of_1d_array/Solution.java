package sites.leetcode.p_1480_running_sum_of_1d_array;

import java.util.Arrays;

/**
 * Time Complexity : O(N)
 * <p>
 * Space Complexity : O(1)
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};

        int[] output = new int[nums.length];

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            output[i] = sum;
        }
        System.out.println(Arrays.toString(output));
    }
}