package rw.finesoft.carpark;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CarsList {
  public  List<Car> cars = new ArrayList<Car>();
    Car car1 = new Car("RAD500K", "Jimmy Irakiza", "0784670500", 2000);
    Car car2 = new Car("RAD345L", "John Irumva", "0784634500", 500);
    Car car3= new Car("RAD580K", "Mbabazi Yvette", "0784670580", 0);
    Car car4 = new Car("RAE100K", "Tuyishime Annie", "0781000500", 1000);
    Car car5 = new Car("RAF468K", "Neza Fierte", "0784468500", 5000);
    Car car6 = new Car("RAD940K", "Impano Confi", "0788400500", 10000);

   public final Map<String, Car>  carsMap = new HashMap<>();

   public Map<String, Car> assignMap(){
       carsMap.put(car1.getPlateNo(), car1);
       carsMap.put(car2.getPlateNo(), car2);
       carsMap.put(car3.getPlateNo(), car3);
       carsMap.put(car4.getPlateNo(), car4);
       carsMap.put(car5.getPlateNo(), car5);
       carsMap.put(car6.getPlateNo(), car6);
       return carsMap;
   }

    public Iterable<Car> getCars(){
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        return cars;
    }

    public Car findByPlateNo(String plateNo, Map<String, Car> cars){
       Car car = new Car();
       car = cars.get(plateNo);
       return car;
    }
}
