package miscellaneous.dictionary;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 *
 * Dictionary is an abstract class that represents a key/value storage repository
 *
 */
public class DictionaryExample1 {

    public static void main(String args[]){

        Dictionary dictionary = new Hashtable();

        dictionary.put("Name","Blake") ;

        System.out.println(dictionary.elements().nextElement());

    }

}
