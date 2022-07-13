package dsa.array;

import java.util.Arrays;

public class MergeTwoSortedArrayWithExtraSpace {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        mergeArrays(arr1, arr2);
    }

    private static void mergeArrays(int[] arr1, int[] arr2) {
        int s1 = arr1.length;
        int s2 = arr2.length;
        int[] arr3 = new int[s1 + s2];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < s1 && j < s2) {
            if (arr1[i] < arr2[j]) {
                arr3[k] = arr1[i];
                i++;
                k++;
            } else if (arr1[i] > arr2[j]) {
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i < s1) {
            arr3[k++] = arr1[i++];
        }
        while (j < s2) {
            arr3[k++] = arr2[j++];
        }

        System.out.println("Final Array : " + Arrays.toString(arr3));
    }
}
