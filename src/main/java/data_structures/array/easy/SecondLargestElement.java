package data_structures.array.easy;

public class SecondLargestElement {

    public static void main(String[] args) {

        // Expected 34
        int[] arr1 = new int[]{12, 35, 1, 10, 34, 1};
        findSecondLargestElement(arr1);

        // Expected 5
        int[] arr2 = new int[]{10, 5, 10};
        findSecondLargestElement(arr2);

        // Expected None
        int[] arr3 = new int[]{10, 10, 10};
        findSecondLargestElement(arr3);
    }

    private static void findSecondLargestElement(int[] arr) {
        
        if(arr.length<2){
            System.out.println("Invalid Array Size");
            return ;
        }
        
        int first, second;
        first = second = Integer.MIN_VALUE;

        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first)
                first = arr[i];
            else if (arr[i] > second)
                second = arr[i];
        }
        System.out.println("First Largest Element :: " + first);
        System.out.println("Second Largest Element :: " + second);
    }
}
