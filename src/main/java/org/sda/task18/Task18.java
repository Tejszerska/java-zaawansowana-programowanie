package org.sda.task18;
//ZADANIE 18.
//        Stwórz klasę Computer posiadającą pola określające cechy komputera: procesor, ram,
//        karta grafiki, firma oraz model. Zaimplementuj settery, gettery,
//        konstruktor z wszystkimi polami, metody toString() oraz equals() i hashcode().
//        Zainstancjuj kilka obiektów i sprawdź działanie metod.
public class Task18 {
    public static void main(String[] args) {

        Computer computer1 = new Computer("i5", "RDM-G16", "HP", "PCM-666", 8);
        Computer computer2 = new Computer("i5", "RDM-G16", "HP", "PCM-666", 8);
        Computer computer3 = new Computer("i7", "GTX-12", "Lenovo", "P3M-G87", 16);

        System.out.println(computer2.equals(computer1));
        System.out.println(computer2.equals(computer3));
        System.out.println(computer2.toString());
        System.out.println(computer2.hashCode());


    }
}
