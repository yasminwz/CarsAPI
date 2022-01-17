package br.com.yasmin.cars.controller;

import br.com.yasmin.cars.dto.CarDtoRequest;
import br.com.yasmin.cars.dto.CarDtoResponse;
import br.com.yasmin.cars.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping("/insertCar")
    public ResponseEntity<CarDtoResponse> insertCar(@RequestBody CarDtoRequest carDtoRequest){
        CarDtoResponse carDtoResponse = carService.saveCar(carDtoRequest);
        return ResponseEntity.ok(carDtoResponse);
    }

    @GetMapping("/listAll")
    public ResponseEntity<List<CarDtoResponse>> listAll(){
        List<CarDtoResponse> carList = carService.listAll();
        return ResponseEntity.ok(carList);
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity <List<CarDtoResponse>> findById(@PathVariable Long id){
        List<CarDtoResponse> carDtoResponse = carService.findById(id);
        return ResponseEntity.ok(carDtoResponse);
    }

}
