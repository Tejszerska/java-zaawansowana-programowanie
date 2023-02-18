package org.sda.task13;

import org.sda.task12.Car;

import java.util.Comparator;

public enum SortType {
    ASC("malejąco"), DESC("rosnąco");

    private String type;

    SortType(String type) {
        this.type = type;
    }


    public String getType() {
        return type;
    }

}
