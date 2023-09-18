package data_structures.array;
public class CyclicallyRotateArrayToLeft2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int rotationCount = 2; // Number of positions to rotate left

        // Perform the left rotation
        leftRotate(arr, rotationCount);

        // Print the rotated array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Function to perform a left rotation of an array
    public static void leftRotate(int[] arr, int d) {
        int n = arr.length;
        reverseArray(arr, 0, d - 1);     // Reverse the first 'd' elements
        reverseArray(arr, d, n - 1);     // Reverse the remaining 'n-d' elements
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
