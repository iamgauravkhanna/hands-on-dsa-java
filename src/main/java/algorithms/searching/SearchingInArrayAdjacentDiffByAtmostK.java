package algorithms.searching;

public class SearchingInArrayAdjacentDiffByAtmostK {

    public static void main(String[] args) {

        int arr[] = {4, 5, 7, 9, 11, 15, 19, 21};
        int x = 21;
        int k = 4;
        int n = arr.length;

        System.out.println("Element " + x + " is present at index " + search(arr, n, x, k));
    }

    static int search(int arr[], int n, int x, int k) {

        int i = 0;

        while (i < n) {
            if (arr[i] == x)
                return i;
            i = i + Math.max(1, Math.abs(arr[i] - x) / k);
            System.out.println("i = " + i);
        }
        System.out.println("number is " + "not present!");
        return -1;
    }
}