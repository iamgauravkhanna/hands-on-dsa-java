package sorting;

import java.util.Random;

public class BubbleSort2 {

    public static void main(String args[]) {
        Random random = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(99999);
        }

        System.out.println("Before:");
        printArray(arr);

        int iteration = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    isSwapped = true;
                }

                iteration++;
            }
            if (!isSwapped)
                break;
        }

        System.out.println("\nAfter:");
        printArray(arr);
        System.out.println("\nNumber of Iterations : " + iteration);
    }

    private static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}