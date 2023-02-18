package org.sda.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Stwórz metodę, która jako parametr przyjmuje listę stringów,
 * następnie zwraca tą listę posortowaną alfabetycznie od Z do A nie biorąc pod uwagę wielkości liter.
 */
public class Task2 {

    public static void main(String[] args) {
        var input =  List.of("Tomek", "arek", "Arek", "Judyta", "Zbigniew");
        List<String> list = new ArrayList<>(input);

        System.out.println("Lista wejsciowa: " + list);
        sortDescCaseInsensitive(list);
        System.out.println("Lista posortowana: " + list);
        System.out.println("Tomek".compareTo("arek"));
    }

    private static List<String> sortDescCaseInsensitive(List<String> list) {

        list.sort((s1, s2) -> s2.toLowerCase().compareTo(s1.toLowerCase()));
        return list;
    }
}