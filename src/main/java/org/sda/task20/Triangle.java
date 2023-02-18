package org.sda.task20;

public class Triangle extends Shape{
private double a, b, c, h;

    public Triangle(double a, double b, double c, double h) throws ZeroOrNegativeException {
        if(a<=0 || b<=0 || c<=0 || h<=0) throw new ZeroOrNegativeException("Can't be less or equal to zero");
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) throws ZeroOrNegativeException {
        if(a<=0) throw new ZeroOrNegativeException("Can't be less or equal to zero");
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) throws ZeroOrNegativeException {
        if(b<=0) throw new ZeroOrNegativeException("Can't be less or equal to zero");
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) throws ZeroOrNegativeException {
        if(a<=0) throw new ZeroOrNegativeException("Can't be less or equal to zero");
        this.c = c;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) throws ZeroOrNegativeException {
        if(a<=0) throw new ZeroOrNegativeException("Can't be less or equal to zero");
        this.h = h;
    }

    @Override
    protected double calculatePerimeter() {
        return a+b+c;
    }

    @Override
    protected double calculateArea() {
       return Math.max(Math.max(a, b), c) * h;
    }
}
