package data_structures.array;

/**
 * Find Duplicate Elements in Array
 *
 * Using HashSet
 *
 * Time Complexity : O(n)
 */
import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInArray2 {

	public static void main(String[] args) {

		int[] arr = {6, 8, 1, 4, 4, 9, 6, 2, 9, 2, 0, 2};

        // Time Complexity = O(n)
		findDuplicate(arr);
	}

    private static void findDuplicate(int[] list) {

	    Set<Integer> set = new HashSet<>();
	    Set<Integer> duplicate = new HashSet<>();

	    for(int element : list){
	        if(!set.add(element)){
                duplicate.add(element);
            }
        }
        System.out.println("Duplicate Values : " + duplicate);
    }
}