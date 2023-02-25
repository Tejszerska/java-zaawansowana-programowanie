package org.sda.task23;

import java.util.HashMap;
import java.util.Map;

/**
 * Stwórz klasę Zoo, która będzie posiadała zbiór zwierząt oraz pozwalała na otrzymywanie statystyk
 * na temat posiadanych zwierząt:
 * int getNumberOfAllAnimals() → zwraca liczbę wszystkich zwierząt
 * Map<String, Integer> getAnimalsCount() → zwraca liczbę zwierząt każdego gatunku
 * Map<String, Integer> getAnimalsCountSorted() → zwraca liczbę zwierząt każdego gatunku posortowaną
 * na podstawie ilości zwierząt danego gatunku, gdzie pierwszym elementem zawsze jest gatunek z największą ilością zwierząt
 * void addAnimals(String, int) → dodaje n zwierząt danego gatunku
 */
public class Task23 {
    public static void main(String[] args) {
        Map<String, Integer> animals = new HashMap<>();
        animals.put("LEW", 5);
        animals.put("KACZKA", 5);
        animals.put("SLON", 5);

        Zoo zoo = new Zoo(animals);

        System.out.println("zoo.getNumberOfAllAnimals() = " + zoo.getNumberOfAllAnimals());


    }
}
