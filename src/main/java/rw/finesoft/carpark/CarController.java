package rw.finesoft.carpark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/car")
@CrossOrigin
public class CarController {
    @Autowired private CarService carService;

    @PostMapping("/new")
    public ResponseEntity<?> createCar(@RequestBody Car car){
        return new ResponseEntity<>(carService.createCar(car), HttpStatus.CREATED);
    }

    @GetMapping("/{plateNo}")
    public ResponseEntity<?> findCar(@PathVariable String plateNo){
        return new ResponseEntity<>(carService.findCarByPlateNo(plateNo), HttpStatus.OK);
    }

    @GetMapping("/")
    public List<Car> getCars(){
        return carService.getCarsList();
    }
}
