package data_structures.array;

// Recursive Way
// Space Complexity :
// Time Complexity : O(n)
public class ReverseAnArray1 {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        printArray(arr, arr.length);
        recursiveReverse(arr, 0, arr.length-1);
        System.out.println("Reversed array is ");
        printArray(arr, arr.length);

        System.out.println("============================");

        int[] arr1 = {6, 8, 1, 4, 9, 2, 11};
        printArray(arr1, arr1.length);
        recursiveReverse(arr1, 0, arr1.length-1);
        System.out.println("Reversed array is ");
        printArray(arr1, arr1.length);
    }

    static void printArray(int arr[], int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    static void recursiveReverse(int arr[], int start, int end) {
        int temp;
        // adding condition to handle recursion
        if (start >= end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        System.out.println("In Recursion");
        printArray(arr, arr.length);
        recursiveReverse(arr, start + 1, end - 1);
    }
}
