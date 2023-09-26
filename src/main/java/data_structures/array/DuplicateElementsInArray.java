package data_structures.array;

import java.util.HashMap;

public class DuplicateElementsInArray {

    public static void main(String[] args) {

        int[] arr = {6, 8, 1, 4, 4, 9, 6, 2, 9, 2, 0, 2};

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int element : arr) {
            if (hashMap.get(element) == null)
                hashMap.put(element, 0);
            else {
                System.out.println("duplicate element : " + element);
                hashMap.put(element, hashMap.get(element) + 1);
            }
        }
    }
}