package org.sda.task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * ZADANIE 3.
 * Stwórz metodę, która jako parametr przyjmuje mapę, gdzie kluczem jest string,
 * a wartością liczba, a następnie wypisuje każdy element mapy do konsoli w formacie:
 * Klucz: "", Wartość: "". Na końcu każdego wiersza poza ostatnim, powinien być przecinek,
 * a w ostatnim kropka.
 * Przykład:
 * Klucz: Java, Wartość: 18,
 * Klucz: Python, Wartość: 1,
 * …
 * Klucz: PHP, Wartość: 0.
 */
public class Task3 {
    public static void main(String[] args) {

        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("Java", 18);
        mapa.put("Python", 1);
        mapa.put("PHP", 0);

        show(mapa);
    }

    private static void show(Map<String, Integer> mapa) {
        int size = mapa.size();
        AtomicInteger counter = new AtomicInteger();
        mapa.forEach((s, integer) -> {
            counter.getAndIncrement();
            if (counter.intValue() == size - 1) {
                System.out.println("Klucz: " + s + ", Wartość: " + integer + ".");
            } else {
                System.out.println("Klucz: " + s + ", Wartość: " + integer + ",");
            }
        });
    }

    private static void showProperly(Map<String, Integer> mapa) {
        var entry = mapa.entrySet();
        var entryList = new ArrayList<>(entry);
        var size = entry.size();
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                System.out.println("Klucz: " + entryList.get(i).getKey() + ", " +
                        "Wartość: " + entryList.get(i).getValue() + ".");
            } else {
                System.out.println("Klucz: " + entryList.get(i).getKey() + ", " +
                        "Wartość: " + entryList.get(i).getValue() + ",");
            }
        }
    }

    private static void showByIterator(Map<String, Integer> mapa) {
        var entry = mapa.entrySet();
        var iterator = entry.iterator();
        while (iterator.hasNext()) {
            var entryElement = iterator.next();
            if(iterator.hasNext()) {
                System.out.println("Klucz: " + entryElement.getKey() + ", " +
                        "Wartość: " + entryElement.getValue() + ",");
            } else {
                System.out.println("Klucz: " + entryElement.getKey() + ", " +
                        "Wartość: " + entryElement.getValue() + ".");
            }
        }
    }
}
