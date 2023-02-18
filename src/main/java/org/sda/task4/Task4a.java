package org.sda.task4;

/**
 * ZADANIE 4.
 * Stwórz klasę Storage, która będzie miała prywatne pole typu Map, publiczny konstruktor oraz metody:
 * addToStorage(String key, String value) → dodawanie elementów do przechowywalni
 * printValues(String key) → wyświetlanie wszystkich elementów pod danym kluczem
 * findValues(String value) → wyświetlanie wszystkich kluczy, które mają podaną wartość
 *
 * Klasa Storage powinna pozwalać na przechowywanie wielu wartości pod jednym kluczem.
 */
public class Task4a {

    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.addToStorage("Java", "10");
        storage.addToStorage("Python", "10");
        storage.addToStorage("C#", "5");
        storage.addToStorage("C#", "15");

        storage.printValues("Java");

        storage.findValues("10");
    }
}
