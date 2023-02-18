package org.sda.task17;
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
public class MeasurementConverter {
    static double  convert(int value, ConversionType conversionType){
        return value * conversionType.getConverter();
    }

    public static void main(String[] args) {
        System.out.println(convert(100, ConversionType.METERS_TO_YARDS));
        System.out.println(convert(100, ConversionType.CENTIMETERS_TO_ICHES));
        System.out.println(convert(100, ConversionType.KILOMETERS_TO_MILES));
    }
}
