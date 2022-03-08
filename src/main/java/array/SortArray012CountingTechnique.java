package array;

public class SortArray012CountingTechnique {

    static void sortarray(int[] array) {

        System.out.print("Input : ");
        for(int value : array)
            System.out.print(" " + value);

        int countzero = 0;
        int countone = 0;
        int counttwo = 0;
        int i = 0;
        int n = array.length;
        while (i < n) {
            if (array[i] == 0) {
                countzero = countzero + 1;
            }
            if (array[i] == 1) {
                countone = countone + 1;
            }
            if (array[i] == 2) {
                counttwo = counttwo + 1;
            }
            i = i + 1;
        }
        i = 0;
        while (i < countzero) {
            array[i] = 0;
            i = i + 1;
        }
        while (i < countone + countzero) {
            array[i] = 1;
            i = i + 1;
        }
        while (i < counttwo + countone + countzero) {
            array[i] = 2;
            i = i + 1;
        }

        System.out.println("");
        System.out.print("Output : ");
        for(int value : array)
            System.out.print(" " + value);
    }

    public static void main(String args[]) {
        sortarray(new int[]{0, 2, 1, 0, 2, 1, 2, 1, 0});
    }
}
