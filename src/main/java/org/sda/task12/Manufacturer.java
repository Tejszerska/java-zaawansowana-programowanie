package org.sda.task12;

import java.util.Objects;

public class Manufacturer {
    private String nazwa,  kraj;
    private int rok;

    public Manufacturer(String nazwa, int rok, String kraj) {
        this.nazwa = nazwa;
        this.rok = rok;
        this.kraj = kraj;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public String getKraj() {
        return kraj;
    }

    public void setKraj(String kraj) {
        this.kraj = kraj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return rok == that.rok && Objects.equals(nazwa, that.nazwa) && Objects.equals(kraj, that.kraj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa, kraj, rok);
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "nazwa='" + nazwa + '\'' +
                ", kraj='" + kraj + '\'' +
                ", rok=" + rok +
                '}';
    }
}
