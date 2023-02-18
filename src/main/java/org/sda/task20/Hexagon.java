package org.sda.task20;

public class Hexagon extends Shape {
    private double a;

    public Hexagon(double a) throws ZeroOrNegativeException {
        if(a<=0) throw new ZeroOrNegativeException("Can't be less or equal to zero");
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) throws  ZeroOrNegativeException{
        if(a<=0) throw new ZeroOrNegativeException("Can't be less or equal to zero");
        this.a = a;
    }

    @Override
    protected double calculatePerimeter() {
        return 6*a;
    }

    @Override
    protected double calculateArea() {
        return (3* Math.pow(a, 2) * Math.sqrt(3))/2;
    }
}
