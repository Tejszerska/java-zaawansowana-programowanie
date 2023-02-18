package org.sda.task20;

public class Rectangle extends Shape {
    private double a;

    public Rectangle(double a) throws ZeroOrNegativeException{
        if(a<=0) throw new ZeroOrNegativeException("Can't be less or equal to zero");
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) throws ZeroOrNegativeException {
        if(a<=0) throw new ZeroOrNegativeException("Can't be less or equal to zero");
        this.a = a;
    }

    @Override
    protected double calculatePerimeter() {
        return 4*a;
    }

    @Override
    protected double calculateArea() {
        return Math.pow(a, 2);
    }
}
