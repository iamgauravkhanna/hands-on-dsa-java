package sorting;

import java.util.Random;

public class InsertionSort {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000000);
        }

        System.out.println("Before:");
        printArray(numbers);

        int iteration = 0;

        //TODO


        System.out.println("\nAfter:");
        printArray(numbers);
        System.out.println("Number of Iterations : " + iteration);

    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
    }
}
