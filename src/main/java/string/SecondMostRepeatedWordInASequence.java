package string;

import java.util.HashMap;
import java.util.Map;

public class SecondMostRepeatedWordInASequence {

    public static void main(String[] args) {
        String[] arr = {"aaa", "ccc", "ddd", "zzz", "zzz", "aaa", "ccc"};
        System.out.println("String with second highest frequency is: " + stringWithSecondHighestFrequency(arr));
    }

    private static String stringWithSecondHighestFrequency(String[] arr) {
        int n = arr.length;
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Store the frequency of strings in a hash map
        for (int i = 0; i < n; i++) {
            Integer keyCount = hashMap.get(arr[i]);
            hashMap.put(arr[i], (keyCount == null) ? 1 : keyCount + 1);
        }

        int maxFrequency = 0;
        int secondMaxFrequency = 0;

        // Find the second highest frequency
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            maxFrequency = Math.max(maxFrequency, entry.getValue());
            if (entry.getValue() < maxFrequency && secondMaxFrequency < entry.getValue()) {
                secondMaxFrequency = entry.getValue();
            }
        }

        // Find the string with second highest frequency
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() == secondMaxFrequency) {
                return entry.getKey();
            }
        }
        return "";
    }
}
