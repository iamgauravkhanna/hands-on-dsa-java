package string;

public class LenghtOfString {

    public static void main(String[] args) {
        String string = "Mumbai";
        int i = 0;
        for (char c : string.toCharArray())
            i++;
        System.out.println("Length of String : " + i);
    }
}