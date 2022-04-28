package string;

import java.util.Arrays;

public class ReplaceSubString {

    public static void main(String args[]) {
        ReplaceSubString replaceSubStringObj = new ReplaceSubString();
        replaceSubStringObj.replaceSubString1();
        replaceSubStringObj.replaceSubString2();
        replaceSubStringObj.replaceSubString3();
    }

    public void replaceSubString1() {

        String str = "I use selenium webdriver. selenium is a tool for web applications automation.";
        String toBeReplaced = "selenium";
        String toReplacedWith = "Firefox";
        String[] arrayOfWords = str.split(toBeReplaced);
        StringBuffer stringBuffer = new StringBuffer();

        System.out.println(Arrays.toString(arrayOfWords));

        for (int i = 0; i <= arrayOfWords.length - 1; i++) {
            stringBuffer = stringBuffer.append(arrayOfWords[i]);
            if (i != arrayOfWords.length - 1) {
                stringBuffer = stringBuffer.append(toReplacedWith);
            }
        }
        System.out.println(stringBuffer);
    }

    public void replaceSubString2() {

        String str = "I use selenium webdriver. selenium is a tool for web applications automation.";
        String toBeReplaced = "selenium";
        String toReplacedWith = "Firefox";
        String updatedStr = str.replace(toBeReplaced, toReplacedWith);
        System.out.println(updatedStr);
    }

    public void replaceSubString3() {

        String str = "I use selenium webdriver. selenium is a tool for web applications automation.";
        StringBuffer stringBufferObj = new StringBuffer(str);
        System.out.println(stringBufferObj.replace(6, 14, "Firefox"));
        System.out.println(stringBufferObj.replace(25, 33, "Firefox"));
    }
}