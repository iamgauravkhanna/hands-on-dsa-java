package data_structures.array;

/*
Using Binary Search due to sorted dsa.array
 */
public class MaximumElementInASortedAndRotatedArray {

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 1, 2};
        System.out.println("Maximum Element : " + findMax(arr, 0, arr.length - 1));
    }

    static int findMax(int[] arr, int low, int high) {

        if (high == low)
            return arr[low];

        int mid = low + (high - low) / 2;

        if (mid == 0 && arr[mid] > arr[mid + 1])
            return arr[mid];

        if (arr[low] > arr[mid])
            return findMax(arr, low, mid - 1);
        else
            return findMax(arr, mid + 1, high);
    }
}