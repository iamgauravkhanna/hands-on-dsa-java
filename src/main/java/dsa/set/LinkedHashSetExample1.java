package dsa.set;

import java.util.LinkedHashSet;

/**
 *
 * HashSet is unordered and unsorted Set.
 * LinkedHashSet is the ordered version of HashSet.
 *
 * The only difference between HashSet and LinkedHashSet is that:
 * LinkedHashSet maintains the insertion order.
 *
 * When we iterate through a HashSet, the order is unpredictable while it is predictable in case of LinkedHashSet.
 *
 * The reason for how LinkedHashSet maintains insertion order is that:
 * The underlying used data structure is Doubly-Linked-List.
 *
 */
public class LinkedHashSetExample1 {

    public static void main(String args[]) {

        LinkedHashSet<String> linkedHashSet =new LinkedHashSet<String>();

        linkedHashSet.add("Blue") ;

        linkedHashSet.add("Red") ;

        linkedHashSet.add("Green") ;

        linkedHashSet.add("Blue") ;

        linkedHashSet.add("Yellow") ;

        linkedHashSet.add("White") ;

        linkedHashSet.add(null);

        System.out.println(linkedHashSet);

    }

}
