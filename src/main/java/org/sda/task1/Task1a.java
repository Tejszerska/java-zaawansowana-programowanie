package org.sda.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Stwórz metodę, która jako parametr przyjmuje listę stringów,
//        następnie zwraca tą listę posortowaną alfabetycznie od Z do A.
public class Task1a {

    public static void main(String[] args) {
        var input = List.of("raz", "dwa", "trzy", "cztery", "pięć");
        List<String> toSort = new ArrayList<>(input);
        System.out.println(sortDesc(toSort));
    }

    public static List<String> sortDesc(List<String> list){
        Collections.sort(list);
        Collections.reverse(list);
        return list;
    }
}
