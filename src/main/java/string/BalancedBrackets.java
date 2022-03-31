package string;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBrackets {

    public static void main(String[] args) {
        String string = "([{}])";

        if (isBalanced(string))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }

    private static boolean isBalanced(String string) {
        Deque<Character> stack = new ArrayDeque<Character>();

        for (int i = 0; i < string.length(); i++) {
            char x = string.charAt(i);

            // Check for Opening Brackets
            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue;
            }

            // If first character is not opening then return false
            if (stack.isEmpty())
                return false;

            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    // We are checking other brackets so that whole string is traversed
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }
}
