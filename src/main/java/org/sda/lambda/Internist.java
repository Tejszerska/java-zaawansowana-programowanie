package org.sda.lambda;

public class Internist implements Doctor{
    @Override
    public void giveMedicine() {
        System.out.println("Internista podaje antybiotyk");
    }
}
