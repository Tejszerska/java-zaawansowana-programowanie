package org.sda.task12;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car {
    private String nazwa, model;
    private Double cena;
    private int rokProdukcji;
    private List<Manufacturer> listaProducentow;
    private EngineType engineType;

    public Car(String nazwa, String model, double cena, int rokProdukcji, List<Manufacturer> listaProducentow, EngineType engineType) {
        this.nazwa = nazwa;
        this.model = model;
        this.cena = cena;
        this.rokProdukcji = rokProdukcji;
        this.listaProducentow = Objects.requireNonNullElseGet(listaProducentow, ArrayList::new);
        this.engineType = engineType;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public List<Manufacturer> getListaProducentow() {
        return listaProducentow;
    }

    public void setListaProducentow(List<Manufacturer> listaProducentow) {
        this.listaProducentow = listaProducentow;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.cena, cena) == 0 && rokProdukcji == car.rokProdukcji && Objects.equals(nazwa, car.nazwa) && Objects.equals(model, car.model) && Objects.equals(listaProducentow, car.listaProducentow) && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa, model, cena, rokProdukcji, listaProducentow, engineType);
    }

    @Override
    public String toString() {
        return "Car{" +
                "nazwa='" + nazwa + '\'' +
                ", model='" + model + '\'' +
                ", cena=" + cena +
                ", rokProdukcji=" + rokProdukcji +
                ", listaProducentow=" + listaProducentow +
                ", engineType=" + engineType +
                '}';
    }
}
