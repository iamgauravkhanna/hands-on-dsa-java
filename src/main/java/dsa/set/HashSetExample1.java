package dsa.set;

import java.util.HashSet;

/**
 *
 * HashSet doesn’t maintain any order
 * HashSet doesn’t allow duplicates
 * HashSet allows null values
 * HashSet is non-synchronized
 *
 */
public class HashSetExample1 {

    public static void main(String args[]) {

        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Blue") ;

        hashSet.add("Red") ;

        hashSet.add("Green") ;

        hashSet.add("Blue") ;

        hashSet.add("Yellow") ;

        hashSet.add("White") ;

        hashSet.add(null);

        System.out.println(hashSet);

    }
}
