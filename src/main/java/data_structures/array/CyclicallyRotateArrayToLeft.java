package data_structures.array;

import java.util.Arrays;

// Rotate one by one
// Time Complexity: O(N * d)
// Auxiliary Space: O(1)
public class CyclicallyRotateArrayToLeft {

    public static void main(String args[]) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        rotateArray(arr, 2);
    }

    private static void rotateArray(int[] arr, int rotateBy) {

        int start = arr[0];

        System.out.println("Before Rotation :: " + Arrays.toString(arr));

        System.out.println("Rotate Array to Left by " + rotateBy + " positions");

        for (int i = 0; i < rotateBy; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = start;
            start = arr[0];
        }

        System.out.println("After Rotation :: " + Arrays.toString(arr));
    }
}