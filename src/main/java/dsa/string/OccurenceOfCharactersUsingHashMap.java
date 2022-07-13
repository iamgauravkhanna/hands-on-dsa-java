package dsa.string;

import java.util.HashMap;

public class OccurenceOfCharactersUsingHashMap {

    private static void characterCount(String inputString) {

        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        char[] strArray = inputString.toCharArray();

        for (char c : strArray) {
            if (c == ' ')
                continue;
            if (charCountMap.containsKey(c))
                charCountMap.put(c, charCountMap.get(c) + 1);
            else
                charCountMap.put(c, 1);
        }
        System.out.println(inputString + " : " + charCountMap);
    }

    public static void main(String[] args) {
        characterCount("Java J2EE Java JSP J2EE");

        characterCount("All Is Well");

        characterCount("Done And Gone");
    }
}