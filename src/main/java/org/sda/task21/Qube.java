package org.sda.task21;

import org.sda.task20.ZeroOrNegativeException;

public class Qube extends Shape3D{
    private double a;

    public Qube(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    protected double calculatePerimeter() throws CalculatePerimeterException {
        throw new CalculatePerimeterException("Impossible to calculate perimeter for a 3D shape");
    }

    @Override
    protected double calculateArea() {
        return Math.pow(a, 2) * 6;
    }

    @Override
    protected double calculateVolume() {
        return Math.pow(a, 3);
    }

    @Override
    public void fill(int filling) throws ZeroOrNegativeException {
        if (filling<=0) throw new ZeroOrNegativeException("You can't fill with a negative or zero filling.");
        if(filling<calculateVolume()) System.out.println("Too little filling to feel the 3D shape");
        if(filling==calculateVolume()) System.out.println("The shape is filled to the brim");
        if(filling<calculateVolume()) System.out.println("Too much filling! Shape is overfilled");
    }
}
