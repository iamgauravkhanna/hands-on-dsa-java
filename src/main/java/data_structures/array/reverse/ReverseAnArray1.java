package data_structures.array.reverse;

// Recursive Way
// Time Complexity : O(n)
public class ReverseAnArray1 {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        printArray(arr, 6);
        recursiveReverse(arr, 0, 5);
        System.out.println("Reversed array is ");
        printArray(arr, 6);
    }

    static void printArray(int arr[], int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    static void recursiveReverse(int arr[], int start, int end) {
        int temp;
        if (start >= end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        recursiveReverse(arr, start + 1, end - 1);
    }
}
