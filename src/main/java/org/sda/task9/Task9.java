package org.sda.task9;

/* Zadanie 9
* Stwórz klasę Point2D posiadającą pola double x, double y, gettery, settery oraz konstruktor.
        * Następnie stwórz klasę Circle, która będzie miała konstruktor: Circle(Point2D center, Point2D point)
        *
        * Pierwszy parametr określa środek koła, drugi jest dowolnym punktem na okręgu.
        * Na podstawie tych punktów, klasa Circle ma określać:
        * • promień okręgu przy wywołaniu metody double getRadius()
        * • obwód okręgu przy wywołaniu metody double getPerimeter() 2 * PI * r
        * • pole okręgu przy wywołaniu metody double getArea() 2 PI r kwadrat
        * • (trudniejsze) trzy punkty na okręgu co 90 stopni od punktu podanego przy wywołaniu metody
        * List getSlicePoints()
        */
public class Task9 {

    public static void main(String[] args) {
Circle circle = new Circle(new Point2D(1.1, 2.2), new Point2D(3, 4));
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());



    }
}