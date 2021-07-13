package rw.finesoft.carpark;

import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, String> {
    Car findByPlateNo(String plateNo);
}
