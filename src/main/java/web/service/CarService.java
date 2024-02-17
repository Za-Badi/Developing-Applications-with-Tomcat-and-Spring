package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    List<Car> carList;
    public CarService(){
        carList = new ArrayList<>();
        carList.add(new Car("Kia", "Sepctra", 2007));
        carList.add(new Car("Kia", "Optima", 2010));
        carList.add(new Car("Hyundai", "Sonata", 2009));
        carList.add(new Car("Hyundai", "Santafe", 2007));
        carList.add(new Car("Toyota", "Corella", 2007));
    }
    public List<Car> listCars() {

        return carList;
    }

    public List<Car> listCars(int no) {
        return carList.subList(0, no);
    }


}
