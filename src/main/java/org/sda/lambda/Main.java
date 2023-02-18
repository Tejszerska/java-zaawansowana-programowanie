package org.sda.lambda;

public class Main {
    public static void main(String[] args) {

        Doctor internista = new Internist();
        internista.giveMedicine();

        Doctor okulista = () -> System.out.println("Okulista podaje krople");
            }
        }
