package data_structures.array;

import java.util.Arrays;

// Using Temp Array
// Space Complexity : The space complexity of the algorithm is O(n) as the temporary array is of the same length as that of the original array.
// Time Complexity : The time complexity of this algorithm is O(n) as we have to traverse the whole array.
public class ReverseAnArray2 {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6};
        printArray(arr);

        int n = arr.length;

        int[] reversedArr = new int[n];

        for (int i = n - 1; i > -1; i--) {
            reversedArr[n - i - 1] = arr[i];
        }

        printArray(reversedArr);

    }

    static void printArray(int[] arr) {
        System.out.print("\nArray : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
