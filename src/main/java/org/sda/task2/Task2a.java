package org.sda.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task2a {
    public static void main(String[] args) {
        var input = List.of("raz", "dwa", "trzy", "cztery", "pięć", "Trzy", "Dwa");
        List<String> toSort = new ArrayList<>(input);
        System.out.println(sortDescIgnCase(toSort));
    }

    public static  List<String> sortDescIgnCase( List<String> list) {
        // MOJE ROZWIĄZANIE JEST BŁĘDNE, BO ZWRACA LISTĘ ZE WSZYSTKIMI LOWER CASE
//        List<String> sorted = new ArrayList<>();
//        for (String s : list) {
//            sorted.add(s.toLowerCase());
//        }
//        Collections.sort(sorted);
//        Collections.reverse(sorted);
//        return sorted;


        list.sort((s1,s2) ->  s2.toLowerCase().compareTo(s1.toLowerCase()));
        // sortuje odwrotnie, bo najpierw s2 a potem s1
        return list;
    }
}
