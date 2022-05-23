package array;

import java.util.Arrays;

public class CyclicallyRotateArray {

    public static void main(String args[]) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        rotateArray(arr, 2);
    }

    private static void rotateArray(int[] arr, int rotateBy) {

        int start = arr[0];

        System.out.println("Before :");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < rotateBy; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = start;
            start = arr[0];
        }

        System.out.println("");
        System.out.println("After");
        System.out.println(Arrays.toString(arr));
    }
}