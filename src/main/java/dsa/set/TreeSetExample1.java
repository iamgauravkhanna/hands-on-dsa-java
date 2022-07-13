package dsa.set;

import java.util.TreeSet;

public class TreeSetExample1 {

    public static void main(String args[]) {

        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("Blue") ;
        treeSet.add("Red") ;
        treeSet.add("Green") ;

        treeSet.add("Blue") ;

        System.out.println(treeSet);

    }
}
