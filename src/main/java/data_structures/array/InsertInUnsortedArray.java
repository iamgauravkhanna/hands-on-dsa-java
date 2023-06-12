package data_structures.array;

import java.util.Arrays;

public class InsertInUnsortedArray {

    public static void main(String[] args) {
        int[] arr = new int[10];

        arr[0] = 4;
        arr[1] = 2;
        arr[2] = 14;
        arr[3] = 1;
        arr[4] = 9;
        arr[5] = 6;

        int capacity = 10;
        int utilised = 6 ;
        int newElement = 19;
        int position = 3 ;

        System.out.println("Before Insertion :: " + Arrays.toString(arr));

        for(int i = (utilised-1); i >= (position-1); i--)
            arr[i + 1] = arr[i];

        arr[position] = newElement;

        System.out.println("After Insertion :: " + Arrays.toString(arr));
    }
}
