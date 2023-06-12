package data_structures.string;

public class MinimumNumberOfBracketReversalsNeededToMakeExpressionBalanced2 {

    public static void main(String[] args) {
        String expr = "}}{}{{";
        System.out.println(countMinReversals(expr));
    }

    static int countMinReversals(String expr) {
        if (expr.length() % 2 != 0)
            return -1;

        int open = 0, close = 0, reversal = 0;

        for (int i = 0; i < expr.length(); i++) {
            if (expr.charAt(i) == '{')
                open++;
            else {
                if (open == 0)
                    close++;
                else
                    open--;
            }
        }
        reversal = (int) (Math.ceil(open / 2.0) + Math.ceil(close / 2.0));
        return reversal;
    }
}
