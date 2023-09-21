package data_structures.array;

public class InsertInUnsortedArray3 {

    public static void main(String[] args) {

        int[] unsortedArray = {5, 2, 9, 1, 3};
        int elementToInsert = 7;
        int insertionIndex = 2; // Index at which to insert the element

        // Check if the insertion index is valid
        if (insertionIndex < 0 || insertionIndex > unsortedArray.length) {
            System.out.println("Invalid insertion index");
            return;
        }

        // Create a new array with one extra element
        int[] newArray = new int[unsortedArray.length + 1];

        // Copy elements from the old array to the new array up to the insertion index
        for (int i = 0; i < insertionIndex; i++) {
            newArray[i] = unsortedArray[i];
        }

        // Insert the new element at the insertion index
        newArray[insertionIndex] = elementToInsert;

        // Copy the remaining elements from the old array to the new array
        for (int i = insertionIndex + 1; i < newArray.length; i++) {
            newArray[i] = unsortedArray[i - 1];
        }

        // Update the reference to the new array
        unsortedArray = newArray;

        // Print the updated array
        System.out.print("Updated Array: ");
        for (int num : unsortedArray) {
            System.out.print(num + " ");
        }
    }
}
