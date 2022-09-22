package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    private static int CARS_COUNT;
    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car(++CARS_COUNT, "Opel", "Corsa", "A001BB"));
        cars.add(new Car(++CARS_COUNT, "Mersedes Benz", "600", "E666AA"));
        cars.add(new Car(++CARS_COUNT, "Zapor", "Ushastyi", "A999MO"));
        cars.add(new Car(++CARS_COUNT, "UAZ", "Bukhanka", "O123AD"));
        cars.add(new Car(++CARS_COUNT, "Kover", "Samolet", "B/N"));
    }
    @Override
    public List<Car> index() {

        return cars;
    }
    @Override
    public List<Car> show(int count) {

        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
