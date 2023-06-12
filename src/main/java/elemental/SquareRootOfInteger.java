package elemental;

public class SquareRootOfInteger {
    public static void main(String[] args) {
        System.out.println(floorSqrt(1));
        System.out.println(floorSqrt(9));
        System.out.println(floorSqrt(11));
        System.out.println(floorSqrt(6));
    }

    static int floorSqrt(int x) {
        if (x == 0 || x == 1)
            return x;

        int i = 1, result = 1;

        while (result <= x) {
            i++;
            result = i * i;
        }
        return i - 1;
    }
}
