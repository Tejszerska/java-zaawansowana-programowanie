package org.sda.task23;

import java.util.HashMap;
import java.util.Map;

public class Zoo {

    private Map<String, Integer> animals;


    public Zoo(Map<String, Integer> animals) {
        this.animals = animals;
    }

    public Zoo() {
        this.animals = new HashMap<>();
    }

    public Integer getNumberOfAllAnimals() {
        Integer result = 0;
        for (Map.Entry<String, Integer> pair : animals.entrySet()) {
            result += pair.getValue();
        }
        return result;
    }



}
