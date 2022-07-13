package dsa.sorting;

import java.util.Arrays;

public class BubbleSort2 {

    public static void main(String args[]) {

        int[] arr = {9, 2, 6, 4, 1, 7, 3};

        System.out.println("Before:");
        System.out.println(Arrays.toString(arr));

        int iteration = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isSwapped = false; // This flag is to break the loop if single swap hasn't happened
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    isSwapped = true;
                }
                iteration++;
            }
            if (!isSwapped)
                break;
        }

        System.out.println("After:");
        System.out.println(Arrays.toString(arr));
        System.out.println("\nNumber of Iterations : " + iteration);
    }
}