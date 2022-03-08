package array;

public class SortArray012 {

    public static void main(String args[]){
        sortArray(new int[]{0,2,1,2,1,1,1,0,3,5});
    }

    private static void sortArray(int[] arr) {

        System.out.print("Input : ");
        for(int value : arr)
            System.out.print(" " + value);

        for(int i=0; i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp;
                if(arr[i]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }

        System.out.println("");
        System.out.print("Output : ");
        for(int value : arr)
        System.out.print(" " + value);
    }
}
