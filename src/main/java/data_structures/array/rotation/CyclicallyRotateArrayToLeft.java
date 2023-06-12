package data_structures.array.rotation;

import java.util.Arrays;

// Rotate one by one
// Time Complexity: O(N * d)
// Auxiliary Space: O(1)
public class CyclicallyRotateArrayToLeft {

    public static void main(String args[]) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        rotateArray(arr, 2);
    }

    private static void rotateArray(int[] originalArray, int rotateBy) {

        int start = originalArray[0];

        System.out.println("Before Rotation :: " + Arrays.toString(originalArray));

        System.out.println("Rotate Array to Left by " + rotateBy + " position");

        for (int i = 0; i < rotateBy; i++) {
            for (int j = 0; j < originalArray.length - 1; j++) {
                originalArray[j] = originalArray[j + 1];
            }
            originalArray[originalArray.length - 1] = start;
            start = originalArray[0];
        }

        System.out.println("After Rotation :: " + Arrays.toString(originalArray));
    }
}