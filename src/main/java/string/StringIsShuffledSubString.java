package string;

import java.util.Arrays;

public class StringIsShuffledSubString {

    public static void main(String[] args) {
        String str1 = "gauravkhanna";
        String str2 = "programbykhnnaavaruag";

        boolean a = isShuffledSubString(str1, str2);

        // If str1 is subString of str2
        // print "YES" else print "NO"
        if (a)
            System.out.print("YES");
        else
            System.out.print("NO");

    }

    private static boolean isShuffledSubString(String A, String B) {
        int n = A.length();
        int m = B.length();

        // Return false if length of
        // String A is greater than
        // length of String B
        if (n > m) {
            return false;
        } else {

            // Sort String A
            A = sort(A);

            // Traverse String B
            for (int i = 0; i < m; i++) {

                // Return false if (i + n - 1 >= m)
                // doesn't satisfy
                if (i + n - 1 >= m)
                    return false;

                // Initialise the new String
                String str = "";

                // Copy the characters of
                // String B in str till
                // length n
                for (int j = 0; j < n; j++)
                    str += B.charAt(i + j);

                System.out.println("New String : " + str);

                // Sort the String str
                str = sort(str);

                System.out.println("Sorted String : " + str);

                // Return true if sorted
                // String of "str" & sorted
                // String of "A" are equal
                if (str.equals(A))
                    return true;
            }
        }
        return false;
    }

    static String sort(String inputString) {
        // convert input string to char array
        char tempArray[] = inputString.toCharArray();

        // sort tempArray
        Arrays.sort(tempArray);

        // return new sorted string
        return String.valueOf(tempArray);
    }
}

