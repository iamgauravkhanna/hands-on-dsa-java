package dsa.string;

public class LongestCommonPrefix1 {

    public static void main(String[] args) {
        String[] input = {
                "bottle",
                "bob",
                "bore",
                "boats"
        };
        System.out.println("The longest Common Prefix is : " +
                longestCommonPrefixFunc(input, input.length));
    }

    private static String longestCommonPrefixFunc(String[] arr, int n) {

        int minLength = findMinLength(arr, n);

        String result = ""; // Our resultant dsa.string
        char current; // The current character

        for (int i = 0; i < minLength; i++) {
            // Current character (must be same
            // in all strings to be a part of
            // result)
            current = arr[0].charAt(i);

            for (int j = 1; j < n; j++) {
                if (arr[j].charAt(i) != current)
                    return result;

            }

            // Append to result
            result += current;
        }

        return result;

    }

    static int findMinLength(String arr[], int n) {

        int min = arr[0].length();

        for (int i = 1; i < n; i++) {
            if (arr[i].length() < min)
                min = arr[i].length();
        }
        return min;
    }
}
