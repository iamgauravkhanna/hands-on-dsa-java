package data_structures.string;

public class NumberOfFlipsToMakeBinaryStringAlternate {

    public static void main(String args[]) {
        String str = "001";
        System.out.println(minFlipToMakeStringAlternate(str));
    }

    // method return minimum flip to make binary
    // dsa.string alternate
    public static int minFlipToMakeStringAlternate(String str) {
        //  return minimum of following two
        //  1) flips when alternate dsa.string starts with 0
        //  2) flips when alternate dsa.string starts with 1
        return Math.min(getFlipWithStartingCharcter(str, '0'),
                getFlipWithStartingCharcter(str, '1'));
    }

    //  Utility method to get minimum flips when
    //  alternate dsa.string starts with expected char
    public static int getFlipWithStartingCharcter(String str, char expected) {
        int flipCount = 0;
        for (int i = 0; i < str.length(); i++) {
            //  if current character is not expected,
            // increase flip count
            if (str.charAt(i) != expected)
                flipCount++;

            //  flip expected character each time
            expected = flip(expected);
        }
        return flipCount;
    }

    public static char flip(char ch) {
        return (ch == '0') ? '1' : '0';
    }

}