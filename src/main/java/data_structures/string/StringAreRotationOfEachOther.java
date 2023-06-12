package data_structures.string;

public class StringAreRotationOfEachOther {

    public static void main(String args[]) {
        String a = "ABCDEF";
        String b = "CDEFAB";

        String temp = a + a;

        boolean areRotations = (a.length() == b.length()) && (temp.indexOf(b) != 1);

        if (areRotations)
            System.out.println("Strings are rotations of each other");
        else
            System.out.printf("Strings are not rotations of each other");
    }
}