package org.sda.task21;

import org.sda.task20.Shape;
import org.sda.task22.Fillable;

public abstract class Shape3D extends Shape implements Fillable {
    protected abstract double calculateVolume();

}
