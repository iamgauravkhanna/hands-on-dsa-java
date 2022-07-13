package dsa.elemental;

public class PalindromeNumber2 {
    public static void main(String[] args) {
        System.out.println("Is Palindrome :: " + isPalindrome(101));
    }

    public static boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        else if(String.valueOf(x).length() == 1)
            return true;

        String str = String.valueOf(x);

        int i = 0;
        int j = str.length() -1;
        while(j > i){
            if(str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
