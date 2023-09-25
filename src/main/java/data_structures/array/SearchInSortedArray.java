package data_structures.array;

public class SearchInSortedArray {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 50};
        int key = 50;
        binarySearch(arr, 0, arr.length - 1, key);

        arr = new int[]{10, 20, 30, 40};
        binarySearch(arr, 0, arr.length - 1, key);

        key = 99;
        arr = new int[]{10, 20, 30, 40, 42, 67, 99};
        binarySearch(arr, 0, arr.length - 1, key);
    }

    private static void binarySearch(int[] arr, int first, int last, int key) {

        int mid = (first + last) / 2;

        while (first <= last) {
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                System.out.println("Element found at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }

        if (first > last) {
            System.out.println("Element not found!");
        }
    }

}
