package array;

public class LargestSumContiguousSubarray {

    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -4, 2, 2, 1};
        System.out.println("Maximum contiguous sum is " + maxSubArraySum(arr));
    }

    private static int maxSubArraySum(int[] arr) {
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;
        for (int element : arr) {
            maxEndingHere += element;
            if (maxSoFar < maxEndingHere)
                maxSoFar = maxEndingHere;
            if (maxEndingHere < 0)
                maxEndingHere = 0;
        }
        return maxSoFar;
    }
}
