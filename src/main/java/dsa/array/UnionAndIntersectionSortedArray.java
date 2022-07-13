package dsa.array;

public class UnionAndIntersectionSortedArray {

    public static void main(String args[]) {
        int[] array1 = {1, 2, 4, 5, 6, 11, 13};
        int[] array2 = {2, 3, 5, 7, 13, 56, 89};
        int size1 = array1.length;
        int size2 = array2.length;
        printUnion(array1, array2, size1, size2);
        printIntersection(array1, array2, size1, size2);
    }

    private static void printIntersection(int[] array1, int[] array2, int size1, int size2) {
        int i = 0;
        int j = 0;
        System.out.print("INTERSECTION : ");
        while (i < size1 && j < size2) {
            if (array1[i] < array2[j])
                i++;
            else if (array1[i] > array2[j])
                j++;
            else {
                System.out.print(array1[i] + " ");
                i++;
                j++;
            }
        }
    }

    private static void printUnion(int[] array1, int[] array2, int size1, int size2) {
        int i = 0;
        int j = 0;
        System.out.print("UNION : ");
        while (i < size1 && j < size2) {
            if (array1[i] < array2[j]) {
                System.out.print(array1[i] + " ");
                i++;
            } else if (array1[i] > array2[j]) {
                System.out.print(array2[j] + " ");
                j++;
            } else {
                System.out.print(array2[j] + " ");
                i++;
                j++;
            }
        }

        while (i < size1)
            System.out.print(array1[i++] + " ");
        while (j < size2)
            System.out.print(array2[j++] + " ");
    }
}
