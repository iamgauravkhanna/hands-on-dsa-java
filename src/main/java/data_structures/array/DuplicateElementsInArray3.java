package data_structures.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Find Duplicate Elements in Array
 *
 * Using Brute HashMap
 *
 * Time Complexity : O(n)
 */
public class DuplicateElementsInArray3 {

    public static void main(String args[]){

        String[] listOfElements = {"apple","ball","cat","ball","doll","doll","apple","egg"};

        findDuplicateElements(listOfElements);

    }

    static void findDuplicateElements(String[] listOfElements){
        Map<String,Integer> myMap = new HashMap<String,Integer>() ;

        for(String element : listOfElements){
            if(myMap.containsKey(element)){
                myMap.put(element,myMap.get(element)+1);
            }
            else {
                myMap.put(element,1);
            }
        }

        System.out.println(myMap);
    }

}
