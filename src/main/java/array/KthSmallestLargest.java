package array;

import java.util.Arrays;
import java.util.Collections;

public class KthSmallestLargest {
    public static void main(String args[]) {
        int[] arr = {11, 4, 7, 1, 2, 0, 8, 9};
        findKthSmallest(arr, 2);
        findKthLargest(arr, 1);
    }

    private static void findKthSmallest(int[] arr, int position) {
        Arrays.sort(arr);
        System.out.println("Kth Smallest : " + arr[position - 1]);
    }

    private static void findKthLargest(int[] arr, int position) {
        Arrays.sort(arr);
        System.out.println("Kth Largest : " + arr[arr.length - position]);
    }
}
