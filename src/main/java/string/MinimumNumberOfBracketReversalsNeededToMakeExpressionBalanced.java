package string;

import java.util.Stack;

public class MinimumNumberOfBracketReversalsNeededToMakeExpressionBalanced {

    public static void main(String[] args) {
        String expr = "}}{}{{";
        System.out.println(countMinReversals(expr));
    }

    static int countMinReversals(String expr) {

        int length = expr.length();

        // length of expression must be even to make
        // it balanced by using reversals.
        if (length % 2 != 0)
            return -1;

        // After this loop, stack contains unbalanced
        // part of expression, i.e., expression of the
        // form "}}..}{{..{"
        Stack<Character> characterStack = new Stack<>();

        for (int i = 0; i < length; i++) {
            char c = expr.charAt(i);
            if (c == '}' && !characterStack.empty()) {
                if (characterStack.peek() == '{')
                    characterStack.pop();
                else
                    characterStack.push(c);
            } else
                characterStack.push(c);
        }

        // Length of the reduced expression
        // newLength = (m+openBracketsCounter)
        int newLength = characterStack.size();

        // count opening brackets at the end of
        // stack
        int openBracketsCounter = 0;
        while (!characterStack.empty() && characterStack.peek() == '{') {
            characterStack.pop();
            openBracketsCounter++;
        }

        // return ceil(m/2) + ceil(openBracketsCounter/2) which is
        // actually equal to (m+openBracketsCounter)/2 + openBracketsCounter%2 when
        // m+openBracketsCounter is even.
        return (newLength / 2 + openBracketsCounter % 2);
    }
}
