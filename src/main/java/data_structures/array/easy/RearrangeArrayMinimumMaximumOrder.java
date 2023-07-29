package data_structures.array.easy;

import java.util.Arrays;

public class RearrangeArrayMinimumMaximumOrder {

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7};

        System.out.println("Original Order ");
        System.out.println(Arrays.toString(arr));

        rearrange(arr, arr.length);
    }

    private static void rearrange(int[] arr, int length) {

        int temp[] = arr.clone();

        int small = 0, large = length-1;

        boolean flag = true ;

        for(int i = 0;i<length;i++){
            if(flag){
                temp[i] = arr[large];
                large--;
            }
            else{
                temp[i] = arr[small];
                small++;
            }
            flag = !flag;
        }

        System.out.println("New Order ");
        System.out.println(Arrays.toString(temp));
    }
}
