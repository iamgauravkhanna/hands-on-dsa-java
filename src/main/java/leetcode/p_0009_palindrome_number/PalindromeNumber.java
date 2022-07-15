package leetcode.p_0009_palindrome_number;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println("Is Number Palindrome :: " + isPalindrome(10));
        System.out.println("Is Number Palindrome :: " + isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {

        if (x < 0)
            return false;

        int number = x;
        int reverse = 0;

        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return x == reverse;
    }
}