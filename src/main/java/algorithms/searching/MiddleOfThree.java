package algorithms.searching;

public class MiddleOfThree {

    public static void main(String[] args) {
        int a = -11, b = -30, c = 7;
        System.out.println(middleOfThree(a, b, c));
    }

    private static int middleOfThree(int a, int b, int c) {

        // Checking for b
        if ((a < b && b < c) || (c < b && b < a))
            return b;
            // Checking for a
        else if ((b < a && a < c) || (c < a && a < b))
            return a;
        else
            return c;
    }
}