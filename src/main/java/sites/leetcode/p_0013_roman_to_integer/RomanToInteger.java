package sites.leetcode.p_0013_roman_to_integer;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {

        Map<Character, Integer> romanMap = new HashMap<>();

        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        String str = "MCMXCIV";

        int length = str.length();

        int result = romanMap.get(str.charAt(length - 1));

        for (int i = length - 2; i >= 0; i--) {
            // Check if the character at right of current character is bigger or smaller
            if (romanMap.get(str.charAt(i)) >= romanMap.get(str.charAt(i + 1)))
                result += romanMap.get(str.charAt(i));
            else
                result -= romanMap.get(str.charAt(i));
        }
        System.out.println("Result :: " + result);
    }
}
