package data_structures.array;

/**
 * If n is the positive number and a is an dsa.array of integers of length n-1
 * containing elements from 1 to n. Then find the missing number in a in the
 * range from 1 to n. Occurrence of each element is only once. i.e a does not
 * contain duplicates.
 *
 */
public class MissingNumbersInArray {

	// Method to calculate sum of 'n' numbers
	static int sumOfNnumbers(int numberOfElements) {

		//
		int sum = (numberOfElements * (numberOfElements + 1)) / 2;

		//
		return sum;
	}

	// Method to calculate sum of all elements of dsa.array
	static int sumOfElements(int[] arrayObj) {

		//
		int sum = 0;

		//
		for (int i = 0; i < arrayObj.length; i++) {

			//
			sum = sum + arrayObj[i];

		}

		//
		return sum;
	}

	public static void main(String[] args) {

		int numberOfElements = 8;
		int[] arrayObj = { 1, 4, 2, 3, 7, 8, 6 };
		int sumOfNnumbers = sumOfNnumbers(numberOfElements);
		int sumOfElements = sumOfElements(arrayObj);
		int missingNumber = sumOfNnumbers - sumOfElements;
		System.out.println("Missing Number is = " + missingNumber);
	}
}