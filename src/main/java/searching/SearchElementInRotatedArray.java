package searching;

public class SearchElementInRotatedArray {

    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3, 4};
        int len = arr.length;
        int key = 5;
        System.out.println("Index of the element is : " + pivotedBinarySearch(arr, len, key));
    }

    private static int pivotedBinarySearch(int[] arr, int size, int key) {

        int pivot = findPivot(arr, 0, size - 1);

        if (pivot == -1)
            return binarySearch(arr, 0, size - 1, key);

        // If we found a pivot, then first
        // compare with pivot and then
        // search in two subarrays around pivot
        if (arr[pivot] == key)
            return pivot;
        if (arr[0] <= key)
            return binarySearch(arr, 0, pivot - 1, key);
        return binarySearch(arr, pivot + 1, size - 1, key);
    }

    private static int findPivot(int[] arr, int low, int high) {
        if (high < low)
            return -1;
        if (high == low)
            return low;

        // int arr[] = { 8, 9, 10, 1, 2,};

        int mid = (low + high) / 2;

        if (mid < high && arr[mid] > arr[mid + 1])
            return mid;
        if (mid > low && arr[mid] < arr[mid - 1])
            return (mid - 1);
        if (arr[low] >= arr[mid])
            return findPivot(arr, low, mid - 1);

        return findPivot(arr, mid + 1, high);

    }

    static int binarySearch(int arr[], int low, int high, int key) {
        if (high < low)
            return -1;

        int mid = (low + high) / 2;

        if (key == arr[mid])
            return mid;
        if (key > arr[mid])
            return binarySearch(arr, (mid + 1), high, key);

        return binarySearch(arr, low, (mid - 1), key);
    }
}
