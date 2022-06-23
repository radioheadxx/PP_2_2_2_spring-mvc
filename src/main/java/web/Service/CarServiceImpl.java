package web.Service;

import web.model.Car;
import java.util.List;
import java.util.stream.Collectors;
import static web.model.Car.getAllCars;


public class CarServiceImpl implements CarService{
    @Override
    public List<Car> getSomeCars(int numberOfCars) {
        if(numberOfCars >= 5 ) {
            return getAllCars();
        }
        List<Car> carList = getAllCars().stream().limit(numberOfCars).collect(Collectors.toList());
        return carList;
    }
}
