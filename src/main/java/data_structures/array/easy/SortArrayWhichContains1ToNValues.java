package data_structures.array.easy;

import java.util.Arrays;

public class SortArrayWhichContains1ToNValues {
    public static void main(String[] args) {

        int[] arr = {10, 7, 9, 2, 8, 3, 5, 4, 6, 1};

        int i = 0;

        while (i < arr.length) {
            int correctValue = arr[i] - 1;
            System.out.println("correctValue :: " + correctValue);
            if (arr[correctValue] != arr[i]) {
                int temp = arr[i];
                arr[i] = arr[correctValue];
                arr[correctValue] = temp;
            } else {
                i++;
            }
        }
        System.out.println("Output :: " + Arrays.toString(arr));
    }
}
