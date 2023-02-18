package org.sda.task7;

import java.util.ArrayList;
import java.util.List;

/**
 * ZADANIE 7.
 * Stwórz klasę imitującą magazynek do broni.
 * Klasa powinna mieć możliwość definiowania rozmiaru magazynka za pomocą konstruktora.
 * Zaimplementuj metody:
 * <p>
 * loadBullet(String bullet) → dodawanie naboju do magazynka,
 * nie pozwala załadować więcej naboi niż wynosi pojemność magazynka
 * <p>
 * isLoaded() → zwraca informację o tym czy broń jest naładowana (przynajmniej jeden nabój) czy nie -> boolean
 * <p>
 * shot() → jedno wywołanie wystrzeliwuje (wypisuje w konsoli wartość string)
 * jeżeli jest nabój to wypisujemy w konsoli "Wystrzelono!" i zmnniejszamy liczbe kul o 1
 * jeżeli nie ma więcej nabojów to wypisuje w konsoli “pusty magazynek”
 */
public class Magazine {
    private final int capacity;
    private List<String> bullets;

    public Magazine(int capacity) {
        this.capacity = capacity;
        this.bullets = new ArrayList<>();
    }


    public boolean loadBullet(String bullet) {
        if (bullets.size() < capacity) {
            bullets.add(bullet);
            return true;
        } else {
            throw new RuntimeException("Magazynek pełny");
        }
    }

    public boolean isLoaded() {
        return bullets.size() > 0;
    }

    public void shot() {
        if (bullets.isEmpty()) {
            System.out.println("Brak naboi w magazynku");
        } else {
            var lastLoaded = bullets.get(bullets.size() - 1);
            System.out.println("Wystrzelono: " + lastLoaded);
            bullets.remove(lastLoaded);
        }
    }
}
