package data_structures.array;

public class DeleteFromUnsortedArray {

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6}; // Sample unsorted array
        int elementToDelete = 9; // Element to delete from the array

        // Find the index of the element to delete
        int indexToDelete = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToDelete) {
                indexToDelete = i;
                break; // Element found, exit the loop
            }
        }

        // If the element was found, delete it by shifting elements
        if (indexToDelete != -1) {
            for (int i = indexToDelete; i < array.length - 1; i++) {
                array[i] = array[i + 1]; // Shift elements one position to the left
            }
            // Reduce the size of the array by one
            int[] newArray = new int[array.length - 1];
            System.arraycopy(array, 0, newArray, 0, array.length - 1);
            array = newArray;
        }

        // Print the updated array
        System.out.println("Updated Array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}

