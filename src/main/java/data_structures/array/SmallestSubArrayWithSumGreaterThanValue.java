package data_structures.array;

public class SmallestSubArrayWithSumGreaterThanValue {

    public static void main(String[] args) {
        int arr1[] = {1, 4, 45, 6, 10, 19};
        int sum = 5;
        int result = smallestSubArrayWithSum(arr1, arr1.length, sum);

        if (result == arr1.length + 1)
            System.out.println("Not Possible");
        else
            System.out.println(result);
    }

    private static int smallestSubArrayWithSum(int[] arr, int len, int x) {
        int minimumLength = len + 1;

        for (int start = 0; start < len; start++) {

            int currentSum = arr[start];

            if (currentSum > x)
                return 1;

            for (int end = start + 1; end < len; end++) {
                currentSum += arr[end];
                if (currentSum > x && (end - start + 1) < minimumLength)
                    minimumLength = end - start + 1;
            }
        }
        return minimumLength;
    }
}
