package data_structures.array.easy;

public class SeparateOddEvenNumbers {

    public static void main(String[] args) {

        //int[] arr = new int[]{7, 2, 9, 4, 6, 1, 3, 8, 5};
        int arr[] = {12, 17, 70, 15, 22, 65, 21, 90};

        int i = -1, j = 0;

        while (j != arr.length) {
            if (arr[j] % 2 == 0) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }

        for (int element : arr)
            System.out.print(element + ", ");
    }
}
