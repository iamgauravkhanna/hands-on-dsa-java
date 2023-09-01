package sites.leetcode.p_0001_two_sum;

import java.util.HashMap;

/**
 * Using HashMap
 * <p>
 * Time Complexity : O(n)
 * <p>
 * Space Complexity : O(n)
 */
public class TwoSum2 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 9, 15, 16, 19, 21, 34};
        int target = 31;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            Integer requiredNumber = target - arr[i];
            if (hashMap.containsKey(requiredNumber)) {
                System.out.println("Pair Found at :: " + hashMap.get(requiredNumber) + " , " + i);
                return;
            }
            hashMap.put(arr[i], i);
        }
    }
}