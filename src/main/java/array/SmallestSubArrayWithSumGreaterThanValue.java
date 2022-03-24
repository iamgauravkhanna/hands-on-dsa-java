package array;

public class SmallestSubArrayWithSumGreaterThanValue {
    public static void main(String[] args) {
        int arr1[] = {1, 4, 45, 6, 10, 19};
        int x = 51;
        int len = arr1.length;
        int result = smallestSubArrayWithSum(arr1, len, x);
        if (result == len + 1)
            System.out.println("Not Possible");
        else
            System.out.println(result);
    }

    private static int smallestSubArrayWithSum(int[] arr1, int len, int x) {
        return 0;
    }
}
