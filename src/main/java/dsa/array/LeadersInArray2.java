package dsa.array;

public class LeadersInArray2 {

    public static void main(String args[]) {
        int[] arr = {15, 4, 7, 11, 2, 0, 8, 9};
        findLeader(arr);
    }

    private static void findLeader(int[] arr) {

        int largestSoFar = arr[arr.length - 1];
        System.out.print(largestSoFar + " ");

        for (int i = arr.length - 2; i >= 0; i--) {
            if (largestSoFar < arr[i]) {
                largestSoFar = arr[i];
                System.out.print(largestSoFar + " ");
            }
        }
    }
}
