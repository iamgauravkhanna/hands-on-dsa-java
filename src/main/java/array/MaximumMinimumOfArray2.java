package array;

import java.util.Arrays;
import java.util.Collections;

public class MaximumMinimumOfArray2 {
    public static void main(String args[]){
        findMinMax(new int[]{3,7,1,-1,4});
        findMinMax(new int[]{3,7,100,-1,-14});
    }

    static void findMinMax(int[] arr) {
        int min = (int) Collections.min(Arrays.asList(arr));
        int max = (int) Collections.max(Arrays.asList(arr));
        System.out.println("MIN : " + min + " & MAX : " + max);
    }
}
