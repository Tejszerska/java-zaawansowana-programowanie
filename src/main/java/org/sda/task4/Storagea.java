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
public class Storagea {

    private Map<String, String> mapOfStrings;

    public Storagea(Map<String, String> mapOfStrings) {
        this.mapOfStrings = new HashMap<>();
    }

    void addToStorage(String key, String value){
        mapOfStrings.put(key, value);
    }

    void printValues(String key){
        System.out.println(mapOfStrings.get(key));
    }

    void findValues(String value){
        mapOfStrings.forEach((k, v) -> {
            if(v.equals(value)){
                System.out.println(k);
            }
        });
    }
}
