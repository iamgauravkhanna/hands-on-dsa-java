package array;

public class TripletWithGivenSumInArray {

    public static void main(String[] args) {
        int[] arr = {1, 7, 4, 8, 3, 10, 42, 76, 4 , 40, 2};
        int sum = 46;
        findTriplet(arr, sum);
    }

    private static void findTriplet(int[] arr, int sum) {
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == sum) {
                        System.out.println("Triplet is " + arr[i] + ", " + arr[j] + ", " + arr[k]);
                        return;
                    }
                }
            }
        }
    }
}
