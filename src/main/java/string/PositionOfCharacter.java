package string;

public class PositionOfCharacter {

    public static void main(String args[]) {
        String str = ("java is awesome");

        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == 's')
                System.out.println("char found at index : " + i);
    }
}