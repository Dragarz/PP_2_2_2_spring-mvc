package web.service;

import java.util.List;
import web.model.Car;

public class CarServiceImp implements CarService{


    @Override
    public List<Car> getCars(int count, List<Car> cars) {
        return cars.stream().limit(count).toList();
    }
}
