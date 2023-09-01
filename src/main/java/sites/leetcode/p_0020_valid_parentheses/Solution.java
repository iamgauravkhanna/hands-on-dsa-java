package sites.leetcode.p_0020_valid_parentheses;

import java.util.Stack;

public class Solution {

    public static void main(String[] args) {

        String string = "([{()[]{}}])";

        System.out.println("Is Valid String :: " + isValid(string));
    }

    public static boolean isValid(String s) {

        Stack<Character> characterStack = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == '(' || c == '{' || c == '[') {
                characterStack.push(c);
            } else if (c == ')' && !characterStack.isEmpty() && characterStack.peek() == '(') {
                characterStack.pop();
            } else if (c == '}' && !characterStack.isEmpty() && characterStack.peek() == '{') {
                characterStack.pop();
            } else if (c == ']' && !characterStack.isEmpty() && characterStack.peek() == '[') {
                characterStack.pop();
            } else {
                return false;
            }
        }
        return characterStack.isEmpty();
    }
}
