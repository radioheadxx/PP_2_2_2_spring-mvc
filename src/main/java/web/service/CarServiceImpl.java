package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class CarServiceImpl implements CarService {


    @Override
    public List<Car> getSomeCars(int numberOfCars) {
        if (numberOfCars >= 5) {
            return getAllCars();
        }
        List<Car> carList = getAllCars().stream().limit(numberOfCars).collect(Collectors.toList());
        return carList;
    }

    @Override
    public List<Car> getAllCars() {
        List<Car> carList = new ArrayList<>();

        Car car1 = new Car("Nissan", 4525, "white");
        Car car2 = new Car("Porsche", 9898, "grey");
        Car car3 = new Car("Mitsubishi", 7587, "blue");
        Car car4 = new Car("Mazda", 1332, "red");
        Car car5 = new Car("Toyota", 6447, "green");

        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);

        return carList;
    }
}
