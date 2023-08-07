package data_structures.array.easy;

import java.util.Arrays;

public class WaveArray {
    public static void main(String[] args) {
        //int arr[] = {10, 90, 49, 2, 1, 5, 23};
        //int arr[] = {10, 90, 49, 2, 1, 5};
        int arr[] = {10};

        Arrays.sort(arr);

        for(int i = 0 ; i < arr.length-1; i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1]=temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
