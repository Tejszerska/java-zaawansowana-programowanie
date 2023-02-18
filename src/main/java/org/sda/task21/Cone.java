package org.sda.task21;

import org.sda.task20.ZeroOrNegativeException;

public class Cone extends Shape3D {
private double r, h, s;

    public Cone(double r, double h, double s) {
        this.r = r;
        this.h = h;
        this.s = s;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    @Override
    protected double calculateVolume() {
        return (Math.PI * Math.pow(getR(), 2) * getH()) / 3;
    }

    @Override
    protected double calculatePerimeter() throws CalculatePerimeterException {
        throw new CalculatePerimeterException("Impossible to calculate perimeter for a 3D shape");
    }

    @Override
    protected double calculateArea() {
        return Math.PI * Math.pow(getR(), 2) + Math.PI * getR() * getS();
    }

    @Override
    public void fill(int filling) throws ZeroOrNegativeException {
        if (filling<=0) throw new ZeroOrNegativeException("You can't fill with a negative or zero filling.");
if(filling<calculateVolume()) System.out.println("Too little filling to feel the 3D shape");
if(filling==calculateVolume()) System.out.println("The shape is filled to the brim");
if(filling>calculateVolume()) System.out.println("Too much filling! Shape is overfilled");
    }
}
