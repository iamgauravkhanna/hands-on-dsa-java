package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample1 {

    public static void main(String arg[]){

        List<String> list = new ArrayList<>();

        list.add("Berlin") ;
        list.add("Tokyo") ;
        list.add("Helsinki") ;
        list.add("Stockholm");
        list.add("Berlin") ;

        System.out.println("-------------Print Using for loop-------------");

        for(String city : list){
            System.out.println(city);
        }

        System.out.println("-------------Print Using for lambda-------------");
        list.forEach(names -> {
            System.out.println(names);
        });

        System.out.println("-------------Print Using for Iterator-------------");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String names = iterator.next();
            System.out.println(names);
        }

        System.out.println("-------------Print Using for lambda for each remaining -------------");
        Iterator<String> iterator1 = list.iterator();
        iterator1.forEachRemaining(names->{
            System.out.println(names);
        });

        System.out.println("-------------Print Using loop-------------");
        for(int i = 0; i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
