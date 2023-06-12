package elemental;

public class ReverseNumber {

	public long doInvert(long number) {

		long reversedNumber = 0;

		while (number != 0) {

			reversedNumber = (reversedNumber * 10) + (number % 10);

			number = number / 10;
		}

		return reversedNumber;
	}

	public static void main(String args[]) {

		long lnum = 54321;

		ReverseNumber input = new ReverseNumber();

		System.out.println("Input value : " + lnum);

		System.out.println("Inverted value : " + input.doInvert(lnum));
	}
}