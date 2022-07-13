package dsa.dictionary;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * Properties class is the subclass of Hashtable.
 *
 */
public class PropertiesExample1 {

    public static void main(String args[]) throws IOException {

        String path = System.getProperty("user.dir") + System.getProperty("file.separator") + "assets/db.properties" ;

        FileReader fileReader = new FileReader(path);

        Properties properties = new Properties();

        properties.load(fileReader);

        System.out.println(properties);

    }

}
