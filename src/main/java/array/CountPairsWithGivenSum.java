package array;

public class CountPairsWithGivenSum {

    public static void main(String[] args) {
        int[] arr = {1, -4, 7, -1, 5};
        int sum = -5;
        getPairsCount(arr, sum);
    }

    private static void getPairsCount(int[] arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum)
                    count++;
            }
        }
        System.out.printf("Count of Pairs is %d", count);
    }
}
