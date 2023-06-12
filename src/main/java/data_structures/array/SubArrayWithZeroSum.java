package data_structures.array;

/**
 * Using Brute Force
 */
public class SubArrayWithZeroSum {

    public static void main(String args[]) {

        int[] arr = {1, 6, 7, 50, -4, -11, 3, -1, -2, -1};
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                System.out.println(" i = " + i + " : j = " + j);
                sum = sum + arr[j];
                if (sum == 0) {
                    found = true;
                    break;
                }
            }
            if (found) break;
        }
        System.out.println("SubArray Found? " + found);
    }
}
