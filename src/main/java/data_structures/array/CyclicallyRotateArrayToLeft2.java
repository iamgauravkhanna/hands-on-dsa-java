package data_structures.array;

import java.util.Arrays;

// Space Complexity :
// Time Complexity :
public class CyclicallyRotateArrayToLeft2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int rotationCount = 2; // Number of positions to rotate left

        System.out.println("Before Rotation :: " + Arrays.toString(arr));

        // Perform the left rotation
        leftRotate(arr, rotationCount);

        System.out.println("After Rotation :: " + Arrays.toString(arr));
    }

    // Function to perform a left rotation of an array
    public static void leftRotate(int[] arr, int rotateBy) {
        int n = arr.length;
        reverseArray(arr, 0, rotateBy - 1);     // Reverse the first 'd' elements
        reverseArray(arr, rotateBy, n - 1);     // Reverse the remaining 'n-d' elements
        reverseArray(arr, 0, n - 1);     // Reverse the entire array
    }

    // Function to reverse an array or a portion of it
    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
