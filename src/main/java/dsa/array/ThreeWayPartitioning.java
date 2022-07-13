package dsa.array;

import java.util.Arrays;

public class ThreeWayPartitioning {

    public static void main(String[] args) {
        int[] arr = {10, 43, 4, 6, 2, 1, 8, 5, 77};
        threeWayPartition(arr, 6, 8);
        int arr1[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
        threeWayPartition(arr1, 14, 20);
        int arr2[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
        threeWayPartition(arr2, 20, 20);
    }

    private static void threeWayPartition(int[] arr, int low, int high) {

        System.out.println("Array before threeWayPartition : " + Arrays.toString(arr));

        int n = arr.length;
        int start = 0;
        int end = n - 1;

        for (int i = 0; i <= end; ) {
            if (arr[i] < low) {
                int temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
                start++;
                i++;
            } else if (arr[i] > high) {
                int temp = arr[end];
                arr[end] = arr[i];
                arr[i] = temp;
                end--;
            } else
                i++;
        }
        System.out.println("Array after threeWayPartition : " + Arrays.toString(arr));
    }
}