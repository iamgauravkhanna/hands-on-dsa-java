package dsa.array;

public class SortArrayInAscendingOrder {

	public static void main(String[] args) {

		int n, temp;
		int[] a = {5,4,3,2,1};

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.print("Ascending Order: ");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
	}
}
