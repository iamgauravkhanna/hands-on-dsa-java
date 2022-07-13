package dsa.string;

import java.util.HashMap;

public class FindFirstRepeatedWord {

    public static void main(String[] args) {
        firstRepeatedWord("Java is Java which we know");
    }

    public static void firstRepeatedWord(String text) {

        int n = text.length();

        if (n == 0)
            return;

        HashMap<String, Integer> record = new HashMap<String, Integer>();

        String[] word = text.split(" ");

        for (int i = 0; i < word.length; ++i) {
            if (record.containsKey(word[i])) {
                System.out.println("First Repeating Word : " + word[i]);
                return;
            } else
                record.put(word[i], 1);
        }
        System.out.println("No Repeating Word found");
    }
}
