package elemental;

public class PositionOfCharacter {

    public static void main(String args[]) {
        String str = ("You are awesome");
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == 'o')
                System.out.println(i);
    }

}
