package dsa.array;

import java.util.Arrays;

public class TopKElements {
    public static void main(String[] args) {

        int[] arr = {1, 6, 3, 11, 64, 2, 55, 30, 0, 4};
        int k = 4;

        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= arr.length - k; i--)
            System.out.print(arr[i] + " ");
    }
}
