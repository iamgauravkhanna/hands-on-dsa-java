package data_structures.array;

import java.util.HashMap;
import java.util.Map;

public class ElementAppearMoreThanNByKTimes {

    public static void main(String[] args) {

        int[] arr = {1, 5, 7, 3, 3, 3, 3, 2, 4, 6, 5, 7, 5};
        int length = arr.length;
        int k = 5;
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        System.out.println("Print Elements whose count is > " + length / k);

        for (int i = 0; i < length; i++) {
            int val;
            if (hashMap.get(arr[i]) == null) {
                val = 1;
                hashMap.put(arr[i], val);
            } else {
                val = hashMap.get(arr[i]);
                hashMap.put(arr[i], val + 1);
            }
        }

        for (Map.Entry map : hashMap.entrySet()) {
            int val = (int) map.getValue();
            if (val > (length / k)) {
                System.out.print(map.getKey() + " ");
            }
        }
    }
}
