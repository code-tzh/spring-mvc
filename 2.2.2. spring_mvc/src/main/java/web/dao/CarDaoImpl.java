package web.dao;

import web.model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {
    private List<Car> carList;
    {   carList = new ArrayList<>();

        carList.add(new Car("Peugeot 206", "white", 2007));
        carList.add(new Car("Hyundai Santa", "black", 2018));
        carList.add(new Car("Kia Rio III", "white", 2019));
        carList.add(new Car("Nissan Almera", "red", 2008));
        carList.add(new Car("LADA Largus", "black", 2017));
    }

    @Override
    public List<Car> getCarList(Integer count) {
        if((count == null) || ( count > carList.size() )) {
            count = carList.size();
        }
        return carList.subList(0, count);
    }
}
