package org.sda.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Stwórz metodę, która jako parametr przyjmuje listę stringów,
następnie zwraca tą listę posortowaną alfabetycznie od Z do A.

*/
public class Task1 {
    public static void main(String[] args) {
        var input =  List.of("Tomek", "arek", "Arek", "Judyta", "Zbigniew");
        List<String> list = new ArrayList<>(input);


        System.out.println("Lista wejsciowa: " + list);
        sortDesc(list);
        System.out.println("Lista posortowana: " + list);
    }

    private static List<String> sortDesc (List<String> list){
        Collections.sort(list);
        Collections.reverse(list);
        return list;
    }
}
