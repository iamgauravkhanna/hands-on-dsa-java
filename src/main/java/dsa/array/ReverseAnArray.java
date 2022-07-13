package dsa.array;

public class ReverseAnArray {

    public static void main(String args[]){
        // Case 1
        int[] arr = {6,8,1,4,9,2,0};
        printArray(arr);
        reverseArray(arr);

        //Case 2
        int[] arr1 = {6,8,1,4,9,2};
        printArray(arr1);
        reverseArray(arr1);

        //Case 3
        int[] arr2 = {6,8};
        printArray(arr2);
        reverseArray(arr2);

        //Case 4
        int[] arr3 = {8};
        printArray(arr3);
        reverseArray(arr3);
    }

    static void reverseArray(int[] arr) {

        int temp;
        int start = 0;
        int end = arr.length-1;

        while (start<end){
            temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        printArray(arr);
    }

    static void printArray(int[] arr){
        System.out.print("\nArray : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

}
