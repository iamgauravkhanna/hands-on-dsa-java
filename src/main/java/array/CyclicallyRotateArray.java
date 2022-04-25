package array;

public class CyclicallyRotateArray {

    public static void main(String args[]) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        rotateArray(arr, 1);
    }

    private static void rotateArray(int[] arr, int rotateBy) {

        int start = arr[0];

        System.out.println("ORIGINAL ITERATION");
        for (int element : arr) {
            System.out.print(element + " ");
        }

        for (int i = 0; i < rotateBy; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = start;
            start = arr[0];
        }

        System.out.println("");
        System.out.println("FINAL ITERATION");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
