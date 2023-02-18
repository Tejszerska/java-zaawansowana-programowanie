package org.sda.task12;

import java.util.ArrayList;
import java.util.List;

/**
 * ZADANIE 12.
 * Stwórz klasę Manufacturer, która będzie zawierać pola: nazwa, rok założenia, kraj.
 * Uwzględnij wszystkie niezbędne metody oraz parametry konstruktora.
 * Zaimplementuj metody hashCode() i equals() .
 *
 * Stwórz klasę Car, która będzie zawierać pola: nazwa, model, cena, rok produkcji,
 * lista producentów (Manufacturer),
 * oraz typ silnika (reprezentowany jako klasa enum, np. V12, V8, V6, S6, S4, S3).
 * Uwzględnij wszystkie niezbędne metody oraz parametry konstruktora.
 * Zaimplementuj metody hashcode() i equals().
 */
public class Task12 {

    public static void main(String[] args) {
        Manufacturer manufacturer1 = new Manufacturer("Firma Jakaś", 1990, "Polska");
        Manufacturer manufacturer2 = new Manufacturer("Compania", 1930, "Włochy");
        Manufacturer manufacturer4 = new Manufacturer("Compania", 1930, "Włochy");
        Manufacturer manufacturer3 = new Manufacturer("Sehr gut", 1980, "Niemcy");

        List<Manufacturer> list1 = new ArrayList<>();
        list1.add(manufacturer1);
        list1.add(manufacturer2);
        List<Manufacturer> list2 = new ArrayList<>();
        list2.add(manufacturer3);
        list2.add(manufacturer4);

        System.out.println(manufacturer2.equals(manufacturer1));
        System.out.println(manufacturer2.equals(manufacturer4));


        Car car1 = new Car("NZE", "Czerwony", 30.000, 2015, list1, EngineType.V8);
        Car car2 = new Car("NZE", "Czerwony", 30.000, 2015, list1, EngineType.V8);
        Car car3 = new Car("Kfiat", "Najszybszy", 420.000, 2022, list2, EngineType.S4);

        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(car3));

        System.out.println(car1.getListaProducentow());




    }
}