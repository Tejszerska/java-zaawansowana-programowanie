package org.sda.task9;

import org.sda.task10.Movable;
import org.sda.task10.MoveDirection;
import org.sda.task11.Resizable;

public class Circle implements Movable, Resizable {

     private Point2D center;
     private Point2D point;

     public Circle(Point2D center, Point2D point) {
         this.center = center;
         this.point = point;
     }

     public Point2D getCenter() {
         return center;
     }

     public void setCenter(Point2D center) {
         this.center = center;
     }

     public Point2D getPoint() {
         return point;
     }

     public void setPoint(Point2D point) {
         this.point = point;
     }

     double getRadius() {
         double part1 = Math.pow(point.getX() - center.getX(), 2);
         double part2 = Math.pow(point.getY() - center.getY(), 2);
         return Math.sqrt(part1 + part2);
     }

     double getPerimeter() {
        return Math.PI * getRadius() * 2;
     }

     double getArea(){
         return Math.pow(Math.PI * getRadius(), 2);
     }

    @Override
    public void move(MoveDirection moveDirection) {
         this.center.move(moveDirection); // obojętnie this jest czy nie, bo w tej klasie jest tylko jedno center (zmienne o tej samej nazwie - center)
         this.point.move(moveDirection);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", point=" + point +
                '}';
    }

    @Override
    public Circle resize(double resizeFactor) {
return null;

    }}


