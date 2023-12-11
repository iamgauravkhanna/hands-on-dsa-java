package data_structures.array;

import java.util.Arrays;

public class CyclicallyRotateArrayToRight1 {

    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 10, 21, 67};
        rotateBy(arr, 2, arr.length);
    }

    private static void rotateBy(int[] arr, int rotateBy, int size) {
        System.out.println("Before Rotation :: " + Arrays.toString(arr));

        // Create Temp Array
        int[] tempArray = new int[size];

        int index = rotateBy;
        int j = 0;

        // Copy values after rotateBy Size
        while (j < size - rotateBy) {
            tempArray[index] = arr[j];
            index++;
            j++;
        }

        index = 0;
        
        for (int i = 0; i < rotateBy; i++) {
            tempArray[index] = arr[j];
            index++;
            j++;
        }

        // finally replacing values in originalArray
        for (int i = 0; i < size; i++) {
            arr[i] = tempArray[i];
        }

        System.out.println("After Rotation :: " + Arrays.toString(arr));

    }


}
