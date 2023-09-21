package data_structures.array.easy;

public class SortArrayInAscendingOrder {

	public static void main(String[] args) {

		int n, temp;
		int[] arr = {5, 2, 8, 7, 1};

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.print("Ascending Order: ");

        for (int element : arr) {
            System.out.print(element + ",");
        }
	}
}
