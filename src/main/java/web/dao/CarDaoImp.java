package web.dao;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Repository;
import web.model.Car;

@Repository
public class CarDaoImp implements CarDao{

    @Override
    public List<Car> getCarList() {
        return Arrays.asList(
                new Car("BMW", 1, "red"),
                new Car("BMW", 2, "black"),
                new Car("BMW", 3, "purpler"),
                new Car("BMW", 4, "white"),
                new Car("BMW", 5, "green")
        );
    }
}
