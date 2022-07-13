package dsa.string;

public class NumberOfFlipsToMakeBinaryStringAlternate1 {

    public static void main(String args[]) {
        String str = "010101";
        System.out.println(mininumFlips(str));
    }

    static int mininumFlips(String str) {
        int flips = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                if (str.charAt(i) == '0')
                    flips++;
            } else if (str.charAt(i) == '1')
                flips++;
        }
        return Math.min(flips, str.length() - flips);
    }
}