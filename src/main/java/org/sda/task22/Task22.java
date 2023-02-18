package org.sda.task22;

import org.sda.task20.ZeroOrNegativeException;
import org.sda.task21.Cone;

//ZADANIE 22.
//        Stwórz interfejs Fillable posiadający metodę fill(). Zaimplementuj metodę w klasie 3DShape
//        z poprzedniego zadania lub osobno w klasach Cone oraz Qube.
//        Metoda fill() powinna przyjmować parametr np. int i sprawdzać, czy po, akcja napełnienia figury:
//        • wleje za dużo wody do figury i przeleje,
//        • napełni figurę wodą po brzegi,
//        • wleje za mało wody.
//        Dla każdej sytuacji powinna zapisać informację o stanie w konsoli. Użyj metody calculateVolume().
public class Task22 {
    public static void main(String[] args) throws ZeroOrNegativeException {
        Cone cone1 = new Cone(3, 4, 5);
        cone1.fill(100);
    }
}
