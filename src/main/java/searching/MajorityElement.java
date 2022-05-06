package searching;

// Find element having most occurrence/majority
public class MajorityElement {

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 1, 2, 5, 1, 1, 3, 1};
        findMajority(arr, arr.length);
    }

    static void findMajority(int arr[], int n) {
        int maxCount = 0;
        int index = -1; // sentinels
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }

        if (maxCount > n / 2)
            System.out.println(arr[index]);
        else
            System.out.println("No Majority Element");
    }
}