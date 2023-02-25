package org.sda.task27;
/**
 * Zaprojektuj klasę Joiner, która w konstruktorze będzie przyjmowała separator (string)
 * oraz posiadała metodę join() pozwalającą na podanie dowolnej ilości obiektów typu T.
 * Metoda ta będzie zwracać stringa łącząc wszystkie przekazane elementy
 * wywołując ich metodę toString() i oddzielać je separatorem.
 * np. dla Integerów oraz separatora “-” będzie zwracała: 1-2-3-4…
 */
public class Task27 {

    public static void main(String[] args) {
        Joiner joiner = new Joiner();
        Integer i1 = 1;
        Integer i2 = 2;
        Integer i3 = 3;

//        String result = Joiner.join(i1, i2, i3);
        System.out.println("result");
    }
}