package org.sda.task16;
//ZADANIE 16.
//        Stwórz klasę enum Runner ze stałymi BEGINNER, INTERMEDIATE, ADVANCED. Enum powinien posiadać dwa parametry:
//        • minimalny czas przebiegnięcia maratonu w minutach
//        • maksymalny czas przebiegnięcia maratonu w minutach
//        Dodatkowo enum Runner powinien zawierać metodę statyczną getFitnessLevel(), która przyjmuje na wejściu dowolny
//        czas przebiegnięcia maratonu, a jako rezultat powinna zwracać konkretny obiekt Runner na podstawie przekazanego czasu.
public enum Runner {
    BEGINNER(30, 60), INTERMEDIATE(10, 29.99 ), ADVANCED(0.1, 9.99);
    private double minTime, maxTime;

    Runner(double minTime, double maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

   public static Runner getFitnessLevel(double time){
        if((BEGINNER.minTime < time ) && (time < BEGINNER.maxTime)){
            return Runner.BEGINNER;
        }
        if((INTERMEDIATE.minTime < time ) && (time < INTERMEDIATE.maxTime)){
            return Runner.INTERMEDIATE;
        }
        if((ADVANCED.minTime < time ) && (time < ADVANCED.maxTime)){
            return Runner.BEGINNER;
        }
        return null;
    }
}
