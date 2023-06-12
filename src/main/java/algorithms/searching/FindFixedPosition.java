package algorithms.searching;

// a fixed point means the element value is the same as the index.
public class FindFixedPosition {

    public static void main(String[] args) {
        findFixPosition(new int[]{-1, 1, 2, 7, 4, -5, 7, 7});
    }

    private static void findFixPosition(int[] arr) {
        System.out.println("Fixed Position Elements : ");
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == i)
                System.out.println(i);
    }
}
