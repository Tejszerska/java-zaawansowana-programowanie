package org.sda.task3;
/*
ZADANIE 3.
Stwórz metodę, która jako parametr przyjmuje mapę, gdzie kluczem jest string, a wartością liczba,
a następnie wypisuje każdy element mapy do konsoli w formacie: Klucz: "", Wartość: "".
Na końcu każdego wiersza poza ostatnim, powinien być przecinek, a w ostatnim kropka.
Przykład:
Klucz: Java, Wartość: 18,
Klucz: Python, Wartość: 1,
…
Klucz: PHP, Wartość: 0.
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task3a {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Java", "18");
        map.put("Python", "1");
        map.put("PHP", "0");

        printNoEditing(map);
        System.out.println("*****************");
        printWithEditing(map);

    }

    public static void printNoEditing(Map<String, String> map) {
        map.forEach((s1, s2) -> System.out.println("Klucz: " + s1 + ", Wartość: " + s2));
    }

    public static void printWithEditing(Map<String, String> map) {
        var entry = map.entrySet();
        var entryList = new ArrayList<>(entry);
        var size = entry.size();

        for (int i = 0; i < size; i++) {
            if(i == size -1){
                System.out.println("Klucz: " + entryList.get(i).getKey() + ", Wartość: " + entryList.get(i).getValue() + ".");
            } else {
                System.out.println("Klucz: " + entryList.get(i).getKey() + ", Wartość: " + entryList.get(i).getValue() + ",");
            }

        }

    }
}