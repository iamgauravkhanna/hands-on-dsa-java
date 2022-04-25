package array;

// Program to Find out middle index where sum of both ends are equal

public class FindMiddleIndexWhenSumOfBothSidesEqual {

	public static int findMiddleIndexMethod(int[] arr) {

		int sumArray = 0;
		int leftSumArray = 0;

		// Here first we traverse the array once to find total sum of array,
		// then we again start from 0th position and start subtracting value
		// from total sum and go on adding it to leftsum and then compare
		// leftsum and total remaining sum
		for (int i = 0; i < arr.length; i++) {
			sumArray += arr[i];
		}

		for (int j = 0; j < arr.length; j++) {
			sumArray = sumArray - arr[j];
			leftSumArray += arr[j];
			if (leftSumArray == sumArray) {
				return j;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] arrayObj = { 2, 6, 8, 0 };
		int middleIndexObj = findMiddleIndexMethod(arrayObj);
		System.out.print("Middle index of the array when both ends sums equal: " + middleIndexObj);
	}
}
