package string;

import java.util.Arrays;

/**
 * Find if string is anagram or not
 */
public class AnagramString2 {

    public static void main(String[] args) {
        String str1 = "Racea";
        String str2 = "Care";
        char[] charArr1 = str1.toLowerCase().toCharArray();
        char[] charArr2 = str2.toLowerCase().toCharArray();

        int NO_OF_CHARS = 256;
        int[] count = new int[NO_OF_CHARS];
        int i;
        boolean result = true;

        if (str1.length() == str2.length()) {

            for (i = 0; i < str1.length(); i++) {
                count[charArr1[i]]++;
                count[charArr2[i]]--;
            }

            for (i = 0; i < NO_OF_CHARS; i++) {
                if (count[i] != 0) {
                    result = false;
                }
            }
            if (result)
                System.out.println(str1 + " and " + str2 + " are anagram.");
            else
                System.out.println(str1 + " and " + str2 + " are not anagram.");
        } else
            System.out.println(str1 + " and " + str2 + " are not anagram.");
    }
}