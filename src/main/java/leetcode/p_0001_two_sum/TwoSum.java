package leetcode.p_0001_two_sum;

/**
 * Using Brute Force
 * <p>
 * Time Complexity : O(N * N)
 * <p>
 * Space Complexity : O(1)
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 9, 15, 16, 19, 21, 34};
        int target = 31;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair Found at :: " + i + " , " + j);
                    return;
                }
            }
        }
    }
}