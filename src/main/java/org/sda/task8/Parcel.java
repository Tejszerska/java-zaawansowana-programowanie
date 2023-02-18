package org.sda.task8;
/**
 * ZADANIE 8.
 * Zaimplementuj interfejs Validator,
 * który będzie zawierać w swojej deklaracji metodę boolean validate(Parcel input).
 * Stwórz klasę Parcel z parametrami:
 * • int xLength
 * • int yLength
 * • int zLength
 * • float weight
 * • boolean isExpress
 * Validator powinien weryfikować czy suma wymiarów (x, y, z) nie przekracza 300,
 * czy każdy z rozmiarów nie jest mniejszy niż 30, czy waga nie przekracza 30.0 dla isExpress=false
 * lub 15.0 dla isExpress=true. W przypadku błędów, powinien o nich poinformować użytkownika.
 */
public class Parcel {
    private int xLength, yLength, zLength;
    private float weight;
    boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    public int getxLength() {
        return xLength;
    }

    public void setxLength(int xLength) {
        this.xLength = xLength;
    }

    public int getyLength() {
        return yLength;
    }

    public void setyLength(int yLength) {
        this.yLength = yLength;
    }

    public int getzLength() {
        return zLength;
    }

    public void setzLength(int zLength) {
        this.zLength = zLength;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }
}
