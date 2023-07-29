package data_structures.array.easy;

public class MoveAllZerosTowardsEnd {
    
    public static void main(String[] args) {
        
        // int[] arr = new int[] { 1, 2, 0, 4, 3, 0, 5, 0 };
        int[] arr = new int[] {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int length = arr.length;
        int count = 0;

        // Traverse the array. If element encountered is
        // non-zero, then replace the element at index 'count'
        // with this element
        for (int i = 0; i < length; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }

        // Now all non-zero elements have been shifted to
        // front and 'count' is set as index of first 0.
        // Make all elements 0 from count to end.
        while (count < length)
            arr[count++] = 0;

        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}