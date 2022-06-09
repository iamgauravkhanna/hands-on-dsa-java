package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {

    public static void main(String args[]) {

        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("name", "gaurav");

        hashMap.put("name1", "jamie");

        hashMap.put("name2", "clarke");

        System.out.println(hashMap);

        for (Map.Entry<String, String> e : hashMap.entrySet()) {

            System.out.println(e.getKey() + " : " + e.getValue());

        }

        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("England", "London");

        capitalCities.put("Germany", "Berlin");

        capitalCities.put("Norway", "Oslo");

        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities);

        System.out.println("Size of Map : " + capitalCities.size());

        // Print Keys
        for (String i : capitalCities.keySet()) {

            System.out.println(i);

        }

        // Print values
        for (String i : capitalCities.values()) {

            System.out.println(i);

        }

    }

}
