package dsa.array.rotation;

import java.util.Arrays;

public class CyclicallyRotateArrayToRight {

    public static void main(String[] args) {
        int arr[] = new int[]{1, 3, 5, 7, 9, 11};
        int rotateBy = 3;
        rightRotate(arr, rotateBy);
    }

    private static void rightRotate(int[] originalArray, int rotateBy) {

        System.out.println("Before Rotation :: " + Arrays.toString(originalArray));

        System.out.println("Rotate Array to Right by " + rotateBy + " position");

        for (int i = 0; i < rotateBy; i++)
            rightRotateByOne(originalArray);

        System.out.println("After Rotation :: " + Arrays.toString(originalArray));
    }

    private static void rightRotateByOne(int[] originalArray) {
        int lastElement = originalArray[originalArray.length - 1];

        for (int i = originalArray.length - 2; i >= 0; i--) {
            originalArray[i + 1] = originalArray[i];
        }
        originalArray[0] = lastElement;
    }
}
