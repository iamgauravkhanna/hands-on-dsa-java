package data_structures.array.easy;

/**
 * Find the largest three elements in an array
 */
public class ThreeLargestDistinctElements {

    public static void main(String[] args) {

        int[] arr = new int[]{6, 5, 56, 45, 23, 5, 9, 7, 4, 10};
//        int[] arr = new int[]{6, 5};

        int first, second, third;
        first = second = third = Integer.MIN_VALUE;

        /* There should be atleast three elements */
        if(arr.length<3) {
            System.out.println("Array Size not correct");
            System.exit(0);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third) {
                third = arr[i];
            }
        }

        System.out.println("ThreeLargestDistinctElements :: " + first + ", " + second + ", " + third);
    }
}
