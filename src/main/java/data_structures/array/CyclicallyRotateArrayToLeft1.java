package data_structures.array;

import java.util.Arrays;

// Left Rotation or Anti Clock-wise
// Using temp array
// Time complexity: O(N)
// Auxiliary Space: O(N)
public class CyclicallyRotateArrayToLeft1 {

    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 10, 21, 67};
        rotateBy(arr, 2, arr.length);
    }

    private static void rotateBy(int[] arr, int rotateBy, int size) {

        System.out.println("Before Rotation :: " + Arrays.toString(arr));

        // Create Temp Array
        int[] tempArray = new int[size];

        int index = 0;

        // Copy values after rotateBy Size
        for (int i = rotateBy; i < size; i++) {
            tempArray[index] = arr[i];
            index++;
        }

        // Storing first rotateBy elements in new array
        for (int i = 0; i < rotateBy; i++) {
            tempArray[index] = arr[i];
            index++;
        }

        // finally replacing values in originalArray
        for (int i = 0; i < size; i++) {
            arr[i] = tempArray[i];
        }

        System.out.println("After Rotation :: " + Arrays.toString(arr));
    }
}
