package array;

public class CommonElementsInThreeArrays {

    public static void main(String[] args) {
        int arr1[] = {1, 1, 2, 3, 11};
        int arr2[] = {1, 1, 3, 4, 5, 11};
        int arr3[] = {1, 1, 2, 3, 4, 6, 11};

        findCommonElements(arr1, arr2, arr3);
    }

    public static void findCommonElements(int[] arr1, int[] arr2, int[] arr3) {
        // stores size of arr1
        int n1 = arr1.length;

        // stores size of arr2
        int n2 = arr2.length;

        // stores size of arr3
        int n3 = arr3.length;

        // stores starting index of arr1
        int i = 0;

        // stores starting index of arr2
        int j = 0;

        // stores starting index of arr3
        int k = 0;

        /*
         * traverses the arrays until
         * we reach the end of
         * one of the arrays
         */
        while (i < n1 && j < n2 && k < n3) {
            // if the integers appointed by i, j and k are equal
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                // prints the common integer
                System.out.println(arr1[i]);

                // increases i, j and k by 1
                i++;
                j++;
                k++;
            }

            /*
             * otherwise, if arr1[i] < arr2[j]
             * we have already found one smaller integer
             * which is arr1[i]
             */
            else if (arr1[i] < arr2[j]) {
                i++; // increases i by 1
            }

            /*
             * otherwise, if arr2[j] < arr3[k]
             * we have got a smaller integer
             * which is arr2[j]
             */
            else if (arr2[j] < arr3[k]) {
                j++; // increases j by 1
            }

            /*
             * otherwise, we consider arr3[k] to be smaller
             */
            else {
                k++; // increases k by 1
            }
        }
    }
}