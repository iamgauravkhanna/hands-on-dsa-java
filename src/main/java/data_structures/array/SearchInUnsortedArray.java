package data_structures.array;

public class SearchInUnsortedArray {

    public static void main(String[] args) {

        int[] arr = {3, 6, 8, 2, 0, 9, 5};

        int searchElement = 3;

        int iterations = 0;

        for (int element : arr) {
            iterations++;
            if (element == searchElement) {
                System.out.println("Element Found");
                break;
            }
        }

        System.out.println("It took " + iterations + " iterations");

    }
}
