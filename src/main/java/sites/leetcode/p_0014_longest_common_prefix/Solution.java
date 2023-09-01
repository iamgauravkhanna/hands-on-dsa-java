package sites.leetcode.p_0014_longest_common_prefix;

public class Solution {

    public static void main(String[] args) {
        String[] input = {
                "bottle",
                "bob",
                "bore",
                "boats"
        };
        System.out.println("The longest Common Prefix is : " + longestCommonPrefix(input));
    }

    public static String longestCommonPrefix(String[] stringArr) {

        StringBuilder longestCommonPrefix = new StringBuilder();

        if (stringArr == null || stringArr.length == 0) {
            return longestCommonPrefix.toString();
        }

        int minimumLength = stringArr[0].length();

        for (int i = 1; i < stringArr.length; i++) {
            minimumLength = Math.min(minimumLength, stringArr[i].length());
        }


        for (int i = 0; i < minimumLength; i++) {

            char current = stringArr[0].charAt(i);

            for (String str : stringArr) {
                if (str.charAt(i) != current) {
                    return longestCommonPrefix.toString();
                }
            }

            longestCommonPrefix.append(current);
        }
        return longestCommonPrefix.toString();
    }
}