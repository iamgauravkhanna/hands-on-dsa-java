package assorted;

import java.util.StringTokenizer;

public class RemoveExtraSpaces {

	public static void main(String args[]) {

		String inputString = "Try    to    remove   extra   spaces.";

		removeSpaces1(inputString);

		removeSpaces2(inputString);
	}

	private static void removeSpaces1(String inputString) {

		StringTokenizer subString = new StringTokenizer(inputString, " ");

		StringBuffer stringBufferObj = new StringBuffer();

		while (subString.hasMoreElements()) {

			stringBufferObj.append(subString.nextElement()).append(" ");

		}

		System.out.println("Actual string: " + inputString);

		System.out.println("After string: " + stringBufferObj.toString().trim());

	}

	private static void removeSpaces2(String inputString) {

		String afterString = inputString.replaceAll("\\s+", " ") ;

		System.out.println("Actual string: " + inputString);

		System.out.println("After string: " + afterString);


	}
}