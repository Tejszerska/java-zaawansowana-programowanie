package org.sda.task20;

import org.sda.task21.CalculatePerimeterException;

//ZADANIE 20.
//        Stwórz abstrakcyjną klasę Shape wraz z abstrakcyjnymi metodami calculatePerimeter()
//        służącą do obliczania obwodu oraz calculateArea() służącą do obliczania powierzchni.
//        Stwórz klasy Rectangle, Triangle, Hexagon, rozszerzając klasę Shape, odpowiednio
//        implementując metody abstrakcyjne. Sprawdź poprawność działania.
public abstract class Shape{
    protected abstract double calculatePerimeter() throws CalculatePerimeterException;
    protected abstract double calculateArea();


}
