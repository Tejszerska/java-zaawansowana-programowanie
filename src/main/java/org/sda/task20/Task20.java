package org.sda.task20;
//ZADANIE 20.
//        Stwórz abstrakcyjną klasę Shape wraz z abstrakcyjnymi metodami calculatePerimeter()
//        służącą do obliczania obwodu oraz calculateArea() służącą do obliczania powierzchni.
//        Stwórz klasy Rectangle, Triangle, Hexagon, rozszerzając klasę Shape, odpowiednio
//        implementując metody abstrakcyjne. Sprawdź poprawność działania.
public class Task20 {
    public static void main(String[] args) throws ZeroOrNegativeException{
        Hexagon hexagon1 = new Hexagon(5);
        System.out.println("Hexagon with a side: a= " + hexagon1.getA());
        System.out.println("hexagon1.calculatePerimeter() = " + hexagon1.calculatePerimeter());
        System.out.println("hexagon1.calculateArea() = " + hexagon1.calculateArea());

        Rectangle rectangle1 = new Rectangle(5);
        System.out.println("Rectangle with a side: a= " + rectangle1.getA());
        System.out.println("rectangle1.calculateArea() = " + rectangle1.calculateArea());
        System.out.println("rectangle1.calculatePerimeter() = " + rectangle1.calculatePerimeter());

        Triangle triangle1 = new Triangle(1, 2, 3, 3);
        System.out.println("triangle1.calculateArea() = " + triangle1.calculateArea());
        System.out.println("triangle1.calculatePerimeter() = " + triangle1.calculatePerimeter());
    }
}
