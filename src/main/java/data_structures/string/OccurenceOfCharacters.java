package data_structures.string;

public class OccurenceOfCharacters {

    /**
     * A to Z = 65 - 90
     * a to z = 97 - 122
     */
    public static void main(String args[]) {

        String inputString = "Gaurav Kumar Khanna";

        int count[] = new int[52];

        int len = inputString.length();

        for (int i = 0; i < len; i++) {

            if (inputString.charAt(i) >= 'A' && inputString.charAt(i) <= 'Z')
                count[inputString.charAt(i) - 'A']++;
            else if (inputString.charAt(i) >= 'a' && inputString.charAt(i) <= 'z')
                count[(inputString.charAt(i) - 'a') + 26]++;
        }

        for (int i = 0; i < 52; i++) {
            if (i >= 0 && i < 26)
                System.out.println("Number of Occurrence of " + (char) (i + 65) + " is: " + count[i]);
            else if (i > 25 && i < 52)
                System.out.println("Number of Occurrence of " + (char) (i + 71) + " is: " + count[i]);
        }
    }
}