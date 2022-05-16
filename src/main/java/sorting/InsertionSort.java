package sorting;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {9, 2, 6, 4, 1, 7, 3};

        System.out.println("Before:");
        System.out.println(Arrays.toString(arr));

        int iteration = 0;

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                if (arr[j] > arr[j + 1]) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = temp;
                iteration++;
            }
        }

        System.out.println("\nAfter:");
        System.out.println(Arrays.toString(arr));
        System.out.print("\nNumber of Iterations : " + iteration);

    }
}
