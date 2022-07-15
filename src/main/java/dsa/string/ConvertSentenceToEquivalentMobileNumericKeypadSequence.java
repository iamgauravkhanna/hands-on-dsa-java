package dsa.string;

public class ConvertSentenceToEquivalentMobileNumericKeypadSequence {

    public static void main(String[] args) {
        // storing the sequence in dsa.array - [0] = A
        String str[] = {"2", "22", "222",
                "3", "33", "333",
                "4", "44", "444",
                "5", "55", "555",
                "6", "66", "666",
                "7", "77", "777", "7777",
                "8", "88", "888",
                "9", "99", "999", "9999"
        };

        String input = "GAURAV";
        System.out.println(printSequence(str, input));
    }

    static String printSequence(String arr[], String input) {
        String output = "";

        int n = input.length();
        for (int i = 0; i < n; i++) {

            if (input.charAt(i) == ' ')
                output = output + "0";
            else {
                int position = input.charAt(i) - 'A';
                output = output + arr[position];
            }
        }
        return output;
    }
}