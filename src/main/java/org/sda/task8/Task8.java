package org.sda.task8;

public class Task8 {
    public static void main(String[] args) {
        //Paczka do nadania:
        Parcel paczka = new Parcel(50,50,50,20,false);
        //Dodajemy walidator
        Validator validator = new ValidatorImpl();
        //sprawdzamy paczkę
        boolean isParcelValid = validator.validate(paczka);
        //informujemy o wyniku
        if (isParcelValid) {
            System.out.println("Paczka jest ok");
        } else {
            System.out.println("Paczka nie jest możliwa do nadania");
        }
    }
}