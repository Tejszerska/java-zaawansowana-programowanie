package org.sda.task6;

import javax.lang.model.element.Element;
import java.util.Map;
import java.util.TreeMap;

public class Task6 {
    public static void main(String[] args) {

        Map<Integer, Element> map = new TreeMap<>();
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Java");
        treeMap.put(10, "Python");
        treeMap.put(5, "C#");

        handleTreeMap(treeMap);

    }

        public static void handleTreeMap(TreeMap<Integer, String> treeMap){
            System.out.println("treeMap.firstEntry() = " + treeMap.firstEntry());
            System.out.println("treeMap.lastEntry() = " + treeMap.lastEntry());
        }
    }

