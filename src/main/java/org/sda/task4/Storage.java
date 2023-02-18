package org.sda.task4;

import java.util.HashMap;
import java.util.Map;

/**
 * ZADANIE 4.
 * Stwórz klasę Storage, która będzie miała prywatne pole typu Map, publiczny konstruktor oraz metody:
 * addToStorage(String key, String value) → dodawanie elementów do przechowywalni
 * printValues(String key) → wyświetlanie wszystkich elementów pod danym kluczem
 * findValues(String value) → wyświetlanie wszystkich kluczy, które mają podaną wartość
 *
 * Klasa Storage powinna pozwalać na przechowywanie wielu wartości pod jednym kluczem.
 */
public class Storage {

    private Map<String, String> map;

    public Storage() {
        this.map = new HashMap<>();
    }

    void addToStorage(String key, String value) {
        map.put(key, value);
    }

    void printValues(String key) {
        System.out.println(map.get(key));
    }

    void findValues(String value) {
        map.forEach((k, v) -> {
            if (v.equals(value)) {
                System.out.println(k);
            }
        });
    }
}
