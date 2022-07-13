package dsa.elemental;

// The Fibonacci sequence is a series of numbers where a number is the sum of previous two numbers.
// Starting with 0 and 1, the sequence goes 0, 1, 1, 2, 3, 5, 8, 13, 21, and so on.
public class FibonacciSeries {

    public static void main(String args[]) {
        printFibSeries(7);
    }

    public static void printFibSeries(int numberOfElements) {

        int a = 0;
        int b = 1;
        int c;

        for (int i = 1; i <= numberOfElements; i++) {
            // Check if we need to print 1st Number only
            if (i == 1)
                System.out.print(a + " ");
            // Check if we need to print 2nd Number only
            else if (i == 2)
                System.out.print(b + " ");
            // Print Nth Number
            else {
                c = a + b;
                System.out.print(c + " ");
                a = b; // shift b to a
                b = c; // shift c to b
            }
        }
    }
}