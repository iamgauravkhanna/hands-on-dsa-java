package dsa.string;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] input = {
                "bottle",
                "bob",
                "bore",
                "boats"
        };
        System.out.println("The longest Common Prefix is : " +
                longestCommonPrefixFunc(input));
    }

    private static String longestCommonPrefixFunc(String[] arr) {

        int size = arr.length;

        /* if size is 0, return empty dsa.string */
        if (size == 0)
            return "";

        /* if size is 1, return 1st element */
        if (size == 1)
            return arr[0];

        /* Sorting will help to reduce comparison between first and last only
        Arrays.sort(arr);

        /* find the minimum length from first and last dsa.string */
        int end = Math.min(arr[0].length(), arr[size - 1].length());

        /* find the common prefix between the first and last dsa.string */
        int i = 0;
        while (i < end && arr[0].charAt(i) == arr[size - 1].charAt(i))
            i++;

        String pre = arr[0].substring(0, i);
        return pre;
    }

}
