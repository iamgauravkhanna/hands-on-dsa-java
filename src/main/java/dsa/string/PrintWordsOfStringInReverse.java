package dsa.string;

import java.util.regex.Pattern;

/**
 * Input : Blue Sky
 * Output : Sky Blue
 */
public class PrintWordsOfStringInReverse {

    // Method to reverse words of a String
    static String reverseWords(String str) {

        // Specifying the pattern to be searched
        Pattern pattern = Pattern.compile("\\s");

        // splitting String str with a pattern
        // (i.e )splitting the dsa.string whenever their
        //  is whitespace and store in temp dsa.array.
        String[] temp = pattern.split(str);
        String result = "";

        // Iterate over the temp dsa.array and store
        // the dsa.string in reverse order.
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                result = temp[i] + result;
            else {
                result = " " + temp[i] + result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s2 = "Blue Sky";
        System.out.println(reverseWords(s2));
    }

}
