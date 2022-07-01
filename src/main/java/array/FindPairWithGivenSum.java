package array;

/**
 * Using Two Pointer given array is sorted
 */
public class FindPairWithGivenSum {

    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 9, 15, 16, 19, 21, 34};
        int sum = 31;
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] + arr[right] == sum) {
                System.out.println("Pair Found at : " + left + "," + right);
                break;
            } else if (arr[left] + arr[right] > sum)
                right--;
            else
                left++;
        }
    }
}