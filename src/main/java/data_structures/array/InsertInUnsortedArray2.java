package data_structures.array;

import java.util.Arrays;

public class InsertInUnsortedArray2 {

    public static void main(String[] args) {
        int[] arr = new int[10];

        arr[0] = 4;
        arr[1] = 2;
        arr[2] = 14;
        arr[3] = 1;
        arr[4] = 9;
        arr[5] = 6;

        int capacity = 10;
        int utilised = 6;
        int newElement = 19;
        int position = 3;

        System.out.println("Before Insertion :: " + Arrays.toString(arr));

        int[] newArray = new int[capacity + 1];

        for (int i = 0; i < position - 1; i++) {
            newArray[i] = arr[i];
        }

        newArray[position - 1] = newElement;

        for (int i = position; i <= utilised; i++) {
            newArray[i] = arr[i - 1];
        }

        System.out.println("After Insertion :: " + Arrays.toString(newArray));
    }
}
