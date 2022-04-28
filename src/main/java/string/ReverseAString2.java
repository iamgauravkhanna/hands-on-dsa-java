package string;

import java.util.Scanner;

public class ReverseAString2 {

    private static Scanner scannerObj;

    public static void main(String args[]) {

        scannerObj = new Scanner(System.in);

        System.out.println("Enter Sentence with 2 or more words");

        String inputString = scannerObj.nextLine();

        System.out.println("Input String : " + inputString);

        String[] words = inputString.split(" ");

        String outputString = "";

        for (String s : words) {
            for (int i = s.length() - 1; i >= 0; i--) {
                outputString = outputString + s.charAt(i);
            }
            outputString = outputString + " ";
        }
        System.out.println("Ouput String : " + outputString);
    }
}