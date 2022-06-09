package dictionary;

import java.util.Hashtable;

/**
 *
 * A Hashtable is an array of a list. Each list is known as a bucket.
 * The position of the bucket is identified by calling the hashcode() method.
 * A Hashtable contains values based on the key.
 * Java Hashtable class contains unique elements.
 * Java Hashtable class doesn't allow null key or value.
 * Java Hashtable class is synchronized.
 *
 */
public class HashTableExample1 {

    public  static void main(String args[]){

        Hashtable<String,String> hashtable = new Hashtable<>();

        hashtable.put("Color","Blue");

        hashtable.put("Place","India") ;

        System.out.println(hashtable.elements().nextElement());

    }

}
