package searching;

import java.util.HashMap;

public class MajorityElement2 {

    public static void main(String[] args) {
        int a[] = new int[]{2, 2, 2, 2, 5, 5, 2, 3, 3};
        findMajority(a);
    }

    static void findMajority(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int count = map.get(arr[i]) + 1;
                if (count > arr.length / 2) {
                    System.out.println("Majority found :- " + arr[i]);
                    return;
                } else
                    map.put(arr[i], count);
            } else
                map.put(arr[i], 1);
        }
        System.out.println("No Majority element");
    }
}
