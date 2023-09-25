package data_structures.array;

import java.util.Scanner;

public class DeleteFromSortedArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the element to be deleted : ");
        int num = scanner.nextInt();

        //First check element is prsent or not in the array,
        //if it is not present print element is not present.
        //If it is present return position of that element

        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            System.out.println(num + " is not present");

        } else {
            System.out.println(num + " is present at position" + pos + " to be deleted");

                       /* Execute a loop to move all elements left by 1 position having
                          index greater than position where to delete element */

            for (int i = pos; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }

            // Finally print new array after deletion of element
            System.out.println("\nThe new array is : ");
            for (int i = 0; i < n - 1; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
