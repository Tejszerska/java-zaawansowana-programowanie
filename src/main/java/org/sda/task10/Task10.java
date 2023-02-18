package org.sda.task10;
import org.sda.task9.Circle;
import org.sda.task9.Point2D;


public class Task10 {
    public static void main(String[] args) {
        Circle circle = new Circle(new Point2D(1.1, 2.2), new Point2D(3, 4));
MoveDirection moveDirection = new MoveDirection(2, 2);
Point2D point2D1 = new Point2D( 2, 2);
        System.out.println(point2D1);

point2D1.move(moveDirection);
        System.out.println(point2D1);


    }
}
