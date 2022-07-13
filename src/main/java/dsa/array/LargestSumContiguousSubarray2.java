package dsa.array;

// Solution where all numbers are negative
public class LargestSumContiguousSubarray2 {
    public static void main(String args[]) {
        int[] arr = {-2, -3, -1, -4, -12, -42, -10};
        System.out.println("Maximum Sum : " + maxSum(arr));
    }

    static int maxSum(int[] arr) {
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}