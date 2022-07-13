package dsa.array;

public class LeadersInArray {

    public static void main(String args[]) {
        int[] arr = {15, 4, 7, 11, 2, 0, 8, 9};
        findLeader(arr);
    }

    /**
     * Using Brute Force Approach
     *
     * @param arr
     */
    private static void findLeader(int[] arr) {
        System.out.print("Leader : ");
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            int j;
            for (j = i + 1; j < size; j++) {
                if (arr[i] <= arr[j])
                    break;
            }
            if (j == size)
                System.out.print(arr[i] + " ");
        }
    }
}