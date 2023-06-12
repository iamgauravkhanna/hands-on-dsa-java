package data_structures.string;

public class RemoveSpecialCharacterFromString {

    public static void main(String args[]) {
        String str = "This#dsa.string%contains^special*characters&.";

        String str1 = str.replaceAll("[^a-zA-Z0-9]", " ");
        System.out.println(str1);

        String str2 = str.replaceAll("\\W", " ");
        System.out.println(str2);
    }
}
