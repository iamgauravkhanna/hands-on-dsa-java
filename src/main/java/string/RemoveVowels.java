package string;

import java.util.Arrays;
import java.util.List;

public class RemoveVowels {

    public static void main(String[] args) {
        String str = "Gaurav Kumar Khanna";
        System.out.println(removeVowel1(str));
        System.out.println(removeVowel2(str));
    }

    private static String removeVowel2(String str) {

        Character vowels[] = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        List<Character> characterList = Arrays.asList(vowels);

        StringBuffer output = new StringBuffer(str);

        for (int i = 0; i < output.length(); i++) {
            if (characterList.contains(output.charAt(i))) {
                // end is exclusive. only i will be considered for replacement
                output.replace(i, i + 1, "");
                i--;
            }
        }
        return output.toString();
    }

    private static String removeVowel1(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }

}
