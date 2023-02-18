package org.sda.task18;

import java.util.Objects;

//ZADANIE 18.
//        Stwórz klasę Computer posiadającą pola określające cechy komputera: procesor, ram,
//        karta grafiki, firma oraz model. Zaimplementuj settery, gettery,
//        konstruktor z wszystkimi polami, metody toString() oraz equals() i hashcode().
//        Zainstancjuj kilka obiektów i sprawdź działanie metod.
public class Computer {
    private String processor, graphicsCard, brand, model;
    private int ramGB;

    public Computer(String processor, String graphicsCard, String brand, String model, int ramGB) {
        this.processor = processor;
        this.graphicsCard = graphicsCard;
        this.brand = brand;
        this.model = model;
        this.ramGB = ramGB;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRamGB() {
        return ramGB;
    }

    public void setRamGB(int ramGB) {
        this.ramGB = ramGB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ramGB == computer.ramGB && Objects.equals(processor, computer.processor) && Objects.equals(graphicsCard, computer.graphicsCard) && Objects.equals(brand, computer.brand) && Objects.equals(model, computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, graphicsCard, brand, model, ramGB);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ramGB=" + ramGB +
                '}';
    }
}
