package array;

public class ArrayIsSubSetOfArray {

    public static void main(String[] args) {
        int[] mainArr = {1, 7, 6, 33, 5, -98, 200};
        int[] subArr = {1, -98};
        isSubArray(mainArr, subArr);
    }

    private static void isSubArray(int[] mainArr, int[] subArr) {
        int counter = 0;
        for (int i = 0; i < subArr.length; i++) {
            for (int j = 0; j < mainArr.length; j++) {
                if (subArr[i] == mainArr[j]) {
                    counter++;
                    break;
                }
            }
        }
        boolean result = counter == subArr.length;
        System.out.println("Is Sub Array : " + result);
    }
}
