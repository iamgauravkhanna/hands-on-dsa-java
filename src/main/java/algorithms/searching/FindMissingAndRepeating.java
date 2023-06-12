package algorithms.searching;

public class FindMissingAndRepeating {

    public static void main(String[] arguments) {
        int[] arr = {1, 2, 4, 5, 2};
        printMissingAndRepeating(arr);
    }

    private static void printMissingAndRepeating(int[] arr) {
        int[] temp = new int[arr.length];
        int missing = 0, repeat = 0;

        for (int i = 0; i < arr.length; i++) {

            if (temp[arr[i] - 1] == 0)
                temp[arr[i] - 1] = 1;

            if (temp[arr[i] - 1] == 1)
                repeat = arr[i];
        }

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == 0)
                missing = i + 1;
        }
        System.out.println("Missing Number: " + missing + " Repeating Number: " + repeat);
    }
}
