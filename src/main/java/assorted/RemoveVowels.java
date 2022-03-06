package assorted;

import java.util.Arrays;
import java.util.List;

public class RemoveVowels {

    public static void main(String[] args)
    {
        String str = "Gaurav Kumar Khanna";
        System.out.println(removeVowel1(str));
        System.out.println(removeVowel2(str));
    }

    private static String removeVowel2(String str) {

        Character vowels[] = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'};

        List<Character> al = Arrays.asList(vowels);

        StringBuffer sb = new StringBuffer(str);

        for (int i = 0; i < sb.length(); i++) {

            if(al.contains(sb.charAt(i))){
                sb.replace(i, i+1, "") ;
                i--;
            }
        }


        return sb.toString();

    }

    private static String removeVowel1(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }

}
