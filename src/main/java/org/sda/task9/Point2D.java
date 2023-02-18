package org.sda.task9;

import org.sda.task10.Movable;
import org.sda.task10.MoveDirection;

public class Point2D implements Movable { //bez public  bo dostep pakietowy
    private double x, y;

     public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

     double getX() {
        return x;
    }

     void setX(double x) {
        this.x = x;
    }

     double getY() {
        return y;
    }

     void setY(double y) {
        this.y = y;
    }



    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public void move(MoveDirection moveDirection) {
        this.x = moveDirection.getxMD() + this.x;
        this.y += moveDirection.getyMD();
    }

}
