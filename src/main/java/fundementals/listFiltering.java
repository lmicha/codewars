package fundementals;

/*
In this kata you will create a function that takes a list of non-negative integers and strings
 returns a new list with the strings filtered out.
 Example
 Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 123)) => List.of(1, 2, 123)
 */

import java.util.ArrayList;
import java.util.List;

public class listFiltering {

    /*
    Create a new List, then iterate over list, if integer then add to new List

     */
    public static List<Object> filterList(final List<Object> list) {

        List<Object> integerList = new ArrayList<>();
        for(int i =0; i< list.size(); i++) {
            if( list.get(i) instanceof Integer ) {
                integerList.add(list.get(i));
            }

        }

        return integerList;
    }
}
