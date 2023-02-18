package org.sda.task17;

import java.util.Scanner;

//ZADANIE 17.
//        Stwórz klasę enum ConversionType ze stałymi METERS_TO_YARDS, YARDS_TO_METERS,
//        CENTIMETERS_TO_ICHES, INCHES_TO_CENTIMETERS, KILOMETERS_TO_MILES,
//        MILES_TO_KILOMETERS.
//        Enum powinien posiadać parametr typu Converter służący do przeprowadzania
//        obliczeń dla danego typu.
//        Następnie stwórz klasę MeasurementConverter, która będzie posiadała metodę
//        convert(int value, ConvertionType conversionType) i na podstawie przekazanej
//        wartości oraz typu konwersji, korzystała z Convertera danego typu i zwracała
//        wynik.
public enum ConversionType{
    METERS_TO_YARDS(1.09), YARDS_TO_METERS(0.9144), CENTIMETERS_TO_ICHES(0.3937), INCHES_TO_CENTIMETERS(2.54),
    KILOMETERS_TO_MILES(0.621), MILES_TO_KILOMETERS(1.609344);
    private double converter;

    ConversionType(double converter) {
        this.converter = converter;
    }

    public double getConverter() {
        return converter;
    }
}
