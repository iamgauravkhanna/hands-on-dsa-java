package data_structures.string;

public class TrimRemoveSpaces {

    public static void main(String[] args) {
        String a = "  this is java    program   ";

        System.out.println(a);

        //Remove extra spaces from both
        System.out.println(new String(a.trim()));

        //Remove extra white spaces to one
        System.out.println(new String(a.replaceAll("\\s+", " ")));

        //Remove extra leading white spaces
        System.out.println(new String(a.replaceAll("^\\s+", "")));

        //Remove extra trailing white spaces
        System.out.println(new String(a.replaceAll("\\s+$", "")));

    }
}
