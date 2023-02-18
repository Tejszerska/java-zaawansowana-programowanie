package org.sda.task13;

import org.sda.task12.Car;
import org.sda.task12.EngineType;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * ZADANIE 13.
 * Stwórz klasę CarService, która będzie zawierać w sobie listę aut, oraz będzie realizować poniższe metody:
 *
 * dodawanie aut do listy,
 * usuwanie auta z listy,
 * zwracanie listy wszystkich aut,
 * zwracanie aut z silnikiem V12,
 * zwracanie aut wyprodukowanych przed rokiem 1999,
 * zwracanie najdroższego auta,
 * zwracanie najtańszego auta,
 * zwracanie auta z co najmniej 3 producentami,
 * zwracanie listy wszystkich aut posortowanych zgodnie z przekazanym parametrem: rosnąco/malejąco,
 */
public class CarService {
    private final List<Car> cars;

    public CarService() {
        this.cars = new ArrayList<>();
    }


    public CarService(List<Car> cars) {
        this.cars = cars;
    }

    public void addCar(Car car){
        this.cars.add(car);
    }

    public void addCars(List<Car> cars) {
this.cars.addAll(cars);
    }

    public void removeCar(Car car){
        this.cars.remove(car);
    }

    public void removeAll(List<Car> cars) {
        this.cars.removeAll(cars);
    }

    public List<Car> getCars(){
        return this.cars;
    }

    public List<Car> findV12(){
              return cars.stream().filter(car -> EngineType.V12.equals(car.getEngineType())).collect(Collectors.toList());
    }

    public List<Car> findByEngineType(EngineType engineType){
        return cars.stream().filter(car -> engineType.equals(car.getEngineType())).collect(Collectors.toList());
    }
    public List<Car> findBefore1999(){
        return cars.stream().filter(car -> car.getRokProdukcji() == 1999).collect(Collectors.toList());

    }

    public Car findMostExpensive (){
            Car result = null;
            for (Car car : cars) {
                if (result == null || result.getCena() <
                        car.getCena()) {
                    result = car;
                }
            }
            return result;
    }

    public Car cheapest(){
        List<Car> temp = this.cars;
        temp.sort((car1, car2) -> car1.getCena().compareTo(car1.getCena()));
        return temp.get(0);
    }
    public List<Car> findCarsWithMin3Manufacturers(){
        return cars.stream().filter(car -> car.getListaProducentow().size() >= 3).collect(Collectors.toList());
    }

    public List<Car> sort(SortType sortType){
        List<Car> temp = this.cars;
        switch(sortType) {
            case ASC:
                temp.sort(Comparator.comparing(Car::getCena)); // wersja po poprawieniu przez Intelij
                System.out.println("Posortowano: " + sortType.getType());
                return temp;
            case DESC:
                temp.sort((c1, c2) -> c2.getCena().compareTo(c1.getCena()));
                System.out.println("Posortowano: " + sortType.getType());
                return temp;
            default:
                throw new RuntimeException("Nieznany błąd");
        }
    }

 ///SAMA NAPISAĆ SORTOWANIE ASC I DESC
    }
