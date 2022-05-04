package string;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListOfString {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("king", "alex", "harry", "james", "rocky");

        List<String> sortedList = list.stream()
                .sorted()
                .collect(Collectors.toList());

        sortedList.forEach(System.out::println);

        System.out.println("- - - - - - - - - - - - - - -");

        List<String> sortedList2 = list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        sortedList2.forEach(System.out::println);

        System.out.println("- - - - - - - - - - - - - - -");

        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list);
    }
}
