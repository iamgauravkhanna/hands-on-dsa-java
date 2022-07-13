package dsa.searching;

public class FirstAndLastPositionOfElementInArray {

    public static void main(String[] args) {
        findPosition(new int[]{1, 3, 6, 7, 7, 7, 7, 1, 15}, 1);
    }

    private static void findPosition(int[] arr, int elementToFind) {
        int start = -1, end = -1;

        for (int i = 0; i < arr.length; i++) {
            if (elementToFind != arr[i])
                continue;
            if (start == -1)
                start = i;
            end = i;
        }

        if (start != -1) {
            System.out.println("First Position : " + start);
            System.out.println("Last Position : " + end);
        }
    }
}
