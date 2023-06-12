package data_structures.string;

/**
 * reverse the order of words in a sentence
 */
public class ReverseAString3 {
    public static void main(String[] args) {
        String str = "PROGRAM USING JAVA";
        reverseStringUsingSpilt(str);
        wordReverse(str);
    }

    static void reverseStringUsingSpilt(String str) {
        System.out.println("Input :: " + str);

        String[] strings = str.split(" ");
        String result = "";

        for (int i = strings.length - 1; i >= 0; i--) {
            result = result + strings[i] + " ";
        }
        System.out.println("Output :: " + result);
    }

    static void wordReverse(String str) {
        System.out.println("Input :: " + str);

        int i = str.length() - 1;
        int start;
        int end = i + 1;

        String result = "";

        while (i >= 0) {
            if (str.charAt(i) == ' ') {
                start = i + 1;

                while (start != end)
                    result += str.charAt(start++);

                result += ' ';

                end = i;
            }
            i--;
        }

        start = 0;

        while (start != end)
            result += str.charAt(start++);

        System.out.println("Output :: " + result);
    }
}
