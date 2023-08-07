package data_structures.array.easy;

import java.util.Arrays;

public class FindNumberOfTriangles {
    public static void main(String[] args) {
        //int arr[] = { 10, 21, 22, 100, 101, 200, 300 };
        int arr[] = {10, 90, 49, 2, 1, 5, 23, 4, 8};
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                for (int k = j + 1; k < arr.length; k++)
                    if (arr[i] + arr[j] > arr[k]) {
                        System.out.println("Combination Found :: " + arr[i] + " " + arr[j] + " " + arr[k]);
                        count++;
                    }

        System.out.println("Total Possible Trianges :: " + count);
    }
}
