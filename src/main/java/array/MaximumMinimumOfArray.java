package array;

public class MaximumMinimumOfArray {
    public static void main(String args[]){
        findMinMax(new int[]{3,7,1,-1,4});
        findMinMax(new int[]{3,7,100,-1,-14});
    }

    static void findMinMax(int[] arr) {
        int min,max;
        min = max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
            else if(arr[i]<min)
                min = arr[i];
        }
        System.out.println("MIN : " + min + " & MAX : " + max);
    }
}
