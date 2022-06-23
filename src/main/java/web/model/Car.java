package web.model;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String model;
    private int series;
    private String color;

    public Car() {
    }

    public Car(String model, int series, String color) {
        this.model = model;
        this.series = series;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", color='" + color + '\'' +
                '}';
    }

    public static List<Car> getAllCars() {
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
