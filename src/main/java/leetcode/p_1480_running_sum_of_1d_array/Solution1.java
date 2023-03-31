package leetcode.p_1480_running_sum_of_1d_array;

import java.util.Arrays;

/**
 * Time Complexity : O(N)
 * <p>
 * Space Complexity : O(1)
 */
public class Solution1 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};

        for(int i = 1;i<nums.length;i++){
            nums[i] = nums[i-1] + nums[i];
        }

        System.out.println(Arrays.toString(nums));
    }
}
