package searching;

public class FindPairWithGivenDifference {
    public static void main(String[] args) {
        int[] arr = {5, 20, 3, 2, 50, 80};
        int difference = 78;
        findPair(arr, difference);
    }

    static void findPair(int[] arr, int difference) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) == difference)
                    System.out.println("Pair Found : " + arr[i] + "," + arr[j]);
            }
        }
    }
}
