package dsa.string;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {

        String str = "aabcdeefff";

        System.out.println("Input : " + str);

        int len = longestUniqueSubStr(str);

        System.out.println("The length of the longest " + "non-repeating character " + "substring is " + len);
    }

    public static int longestUniqueSubStr(String str) {

        int length = str.length();
        int result = 0;

        for (int i = 0; i < length; i++)
            for (int j = i; j < length; j++)
                if (areDistinct(str, i, j))
                    result = Math.max(result, j - i + 1);

        return result;
    }

    public static Boolean areDistinct(String str, int i, int j) {

        boolean[] visited = new boolean[26];

        for (int k = i; k <= j; k++) {
            if (visited[str.charAt(k) - 'a'] == true)
                return false;

            visited[str.charAt(k) - 'a'] = true;
        }
        return true;
    }
}
