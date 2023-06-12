package data_structures.array;

// Program to Find the min and max values from an dsa.array

public class MinimumMaximumInArray {

    public static void main(String args[]) {
        minMaxArray(new int[]{1, 5, 8, 6, 9, 3, 2});
        minMaxArray(new int[]{1, 5, 8, -6, 9, 3, 2, -10});
        minMaxArray(new int[]{6, 9});
        minMaxArray(new int[]{6});
        minMaxArray(new int[]{-1, -5, -8, -9, -3, -2});
    }

    static void minMaxArray(int[] intArr) {
        int min, max;

        if (intArr.length == 1) {
            min = max = intArr[0];
        } else if (intArr[0] < intArr[1]) {
            min = intArr[0];
            max = intArr[1];
        } else {
            min = intArr[1];
            max = intArr[0];
        }

        for (int i = 2; i < intArr.length; i++) {
            if (intArr[i] < min) {
                min = intArr[i];
            } else if (intArr[i] > max) {
                max = intArr[i];
            }
        }
        System.out.println("MIN = " + min + " and MAX = " + max);
    }
}
