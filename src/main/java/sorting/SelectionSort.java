package sorting;

import java.util.Random;

public class SelectionSort {

    public static void main(String[] args){

        int[] arr = {9,2,6,4,1,7,3};

        System.out.println("Before:");
        printArray(arr);

        int iteration = 0;

        for(int i=0;i<arr.length-1;i++){
            int minPosition = i ;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minPosition]){
                    minPosition=j;
                }
                iteration++;
            }
            if(minPosition!=i){
                int temp;
                temp = arr[i];
                arr[i]=arr[minPosition];
                arr[minPosition]=temp;
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
