package sorting;

import java.util.Random;

public class InsertionSort {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1000000);
        }

        System.out.println("Before:");
        printArray(arr);

        int iteration = 0;

        //TODO
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                if (arr[j] > arr[j + 1]) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = temp;
                iteration++;
            }
        }

        System.out.println("\nAfter:");
        printArray(arr);
        System.out.print("\nNumber of Iterations : " + iteration);

    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
