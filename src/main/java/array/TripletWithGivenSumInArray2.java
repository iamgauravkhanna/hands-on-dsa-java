package array;

import java.util.Arrays;

public class TripletWithGivenSumInArray2 {

    public static void main(String[] args) {
        int[] arr = {1, 7, 4, 8, 3, 10, 42, 76, 4, 40, 2};
        int sum = 122;
        findTriplet(arr, sum);
    }

    private static void findTriplet(int[] arr, int sum) {
        int left, right;
        Arrays.sort(arr);

        // Usinng Two Pointers Approach
        for (int i = 0; i < arr.length - 2; i++) {
            left = i + 1;
            right = arr.length - 1;
            while (left < right) {
                if (arr[i] + arr[left] + arr[right] == sum) {
                    System.out.println("Triplet is " + arr[i] + ", " + arr[left] + ", " + arr[right]);
                    return;
                } else if (arr[i] + arr[left] + arr[right] < sum)
                    left++;
                else
                    right--;
            }
        }
    }
}