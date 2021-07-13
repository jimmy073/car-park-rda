package rw.finesoft.carpark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class CarService {
    @Autowired private CarRepository carRepository;
 //   @Autowired private CarsList carsList;

    CarsList carsList = new CarsList();
    Map<String, Car> carsMap = carsList.assignMap();

    public Car createCar(Car car){
        return carRepository.save(car);
    }

    public Car findCar(String plateNo){
        return carRepository.findByPlateNo(plateNo);
    }

    public List<Car> getCarsList(){
        List<Car> cars = new ArrayList<>();
        for(Car car: carsMap.values()){
            cars.add(car);
        }
        return cars;
    }

    public Car findCarByPlateNo(String plateNo){
        return carsMap.get(plateNo);
    }

}
