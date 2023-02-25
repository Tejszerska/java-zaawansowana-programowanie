package org.sda.task14;

import org.sda.lambda.Internist;

import java.util.*;
import java.util.stream.Collectors;

public class Task14 {
    public static void main(String[] args) {

        Integer[] randomInts = prepareRandomArray(100);
        Integer[] unique = findUniqueValues(randomInts);


//        Set<Integer> unique = new HashSet<>();
//        Set<Integer> duplicate = new HashSet<>();
//
//        for(Integer n : randomInts){
//            if(!unique.add(n)){
//                duplicate.add(n);
//            }
//        }
//        System.out.print("Ilość przed odsianiem duplikatów: ");
//        System.out.println(unique.size());
//
////zwróć listę unikalnych elementów
//        System.out.print("Liczba unikalnych elementów: ");
//        unique.removeIf(n -> duplicate.contains(n));
//        System.out.println(unique.size());
//        System.out.print("Lista unikalnych elementów: ");
//        System.out.println(unique);
//
//// zwróć listę elementów, które co najmniej raz powtórzyły się w wygenerowanej tablicy,
//        System.out.print("Liczba powtorzonych elementow: ");
//        System.out.println(duplicate.size());
//    System.out.print("Lista powtorzonych elementow: ");
//        System.out.println(duplicate.stream().sorted().collect(Collectors.toList()));
//
////        zwróć listę 25 najczęściej powtarzających się elementów. NIEDOKOŃCZONE
//
//        List<Integer> sortedRandom = randomInts.stream().sorted().collect(Collectors.toList());
//        System.out.println(sortedRandom);
//        Map<Integer, Integer> howManyTimesDuplicated = new TreeMap<>();
//        for (int i = 0; i < randomInts.size()-1; i++) {
//            int count = 1;
//            for (int j = i + 1; j < randomInts.size(); j++) {
//                if(randomInts.get(i) == randomInts.get(j)) {
//                    count++;
//                } else {
//                    break;
//                }
//            }
//            if(count > 1 )  howManyTimesDuplicated.put(count, randomInts.get(i));
//        }
//        System.out.println(howManyTimesDuplicated);


//        Zaimplementuj metodę, która deduplikuje elementy w liście.
//        przypadku znalezienia duplikatu, zastępuje go nową losową wcześniej nie występującą wartością.


//                Sprawdź czy metoda zadziałała poprawnie wywołując metodę numer 2.
    }

    private static Integer[] prepareRandomArray(int numberOfElements) {
        Integer[] randomInts = new Integer[numberOfElements];
        Random random = new Random();
        for (int i = 0; i < numberOfElements; i++) {
            randomInts[i] = (random.nextInt(numberOfElements / 10));
        }

        return randomInts;
    }

    private static Integer[] findUniqueValues(Integer[] randomInts) {
        List<Integer> uniqueValuesList = new ArrayList<>();
        for (Integer anInt : randomInts) {
            int counter = 0;
            for (Integer randomInt : randomInts) {
                if (anInt.equals(randomInt)) {
                    counter++;
                }
            }
            if (counter == 1) {
                uniqueValuesList.add(anInt);
            }
        }
        return null;
    }

    private static Integer[] mapToArray(List<Integer> list) {
        Integer[] array = new Integer[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
