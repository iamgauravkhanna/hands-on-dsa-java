package miscellaneous.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample1 {

    public static void main(String[] arg){

        LinkedList<String> linkedList = new LinkedList();

        linkedList.add("apple") ;

        linkedList.add("ball") ;

        linkedList.add("cat") ;

        linkedList.addFirst("data");

        linkedList.addLast("element");

        linkedList.add(2, "fan");

        Iterator<String> iterator = linkedList.iterator();

        while (iterator.hasNext()){

            System.out.println("Value : " + iterator.next());

        }

    }
}
