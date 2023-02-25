package org.sda.task29;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;


/**
 * Zaimplementuj generyczną metodę partOf,
 * która na podstawie tablicy dowolnego typu oraz wskazanej funkcji jako parametrów
 * zwróci % elementów spełniających warunek.
 */
public class Task29 {
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double result = Task29.partOf(integers, integer -> integer == 2);
        System.out.println("Procent obiektów spełnaijących założenia: " + result);

    }

    public static <E> double partOf(E[] tab, Function<E, Boolean> function) {
        double count = 0;
        for (E e : tab) {
            if (function.apply(e)) count++;
        }
        return count / tab.length * 100;
    }
}
