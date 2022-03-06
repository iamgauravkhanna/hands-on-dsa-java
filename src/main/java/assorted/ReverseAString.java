package assorted;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseAString {

    // Using StringBuffer - StringBuffer is thread safe
    public String invertWithStringBuffer(String str) {

        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.reverse();
        return stringBuffer.toString();
    }

    // Without Using StringBuffer - StringBuffer is thread safe
    public String invertWithoutStringBuffer(String str) {

        int length = str.length();
        String original = str;
        String invert = "";
        for (int i = length - 1; i >= 0; i--) {
            invert = invert + original.charAt(i);
        }
        return invert;
    }

    // Using StringBuffer - StringBuffer is thread safe
    public String reverse(String str) {

        int i = str.length();
        StringBuffer strb = new StringBuffer();
        for (int j = i - 1; j >= 0; j--) {
            strb.append(str.charAt(j));
        }

        return strb.toString();
    }

    // Using Recursion
    public String reverseStringUsingRecursion(String str) {

        if (str.isEmpty()) {
            return str;
        }

        // Calling Function Recursively
        return reverseStringUsingRecursion(str.substring(1)) + str.charAt(0);
    }

    public void reverseUsingListIterator(String str) {

        char[] charArray = str.toCharArray();

        List<Character> listOfChar = new ArrayList<>();

        for (char c : charArray) {

            listOfChar.add(c);

        }

        Collections.reverse(listOfChar);

        ListIterator listIterator = listOfChar.listIterator();

        while (listIterator.hasNext()) {
            System.out.print(listIterator.next());
        }

    }

    public static void main(String[] args) {

        ReverseAString invertStr = new ReverseAString();

        System.out.println("Reversed String with StringBuffer class => "
                + invertStr.invertWithStringBuffer("Gaurav Kumar Khanna"));

        System.out.println("Reversed String with Byte Array class => "
                + invertStr.invertWithoutStringBuffer("Gaurav Kumar Khanna"));

        System.out.println("Reversed String with Recursion class => "
                + invertStr.reverseStringUsingRecursion("Gaurav Kumar Khanna"));

        System.out.print("Reversed String with List Iterator class => ");

        invertStr.reverseUsingListIterator("Gaurav Kumar Khanna");

    }

}


