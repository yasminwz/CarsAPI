package br.com.yasmin.cars.service;


import br.com.yasmin.cars.dto.CarDtoRequest;
import br.com.yasmin.cars.dto.CarDtoResponse;
import br.com.yasmin.cars.entity.Car;
import br.com.yasmin.cars.repository.CarRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CarService {

    @Autowired(required = false)
    private CarRepository carRepository;

    @Autowired(required = false)
    private ModelMapper modelMapper;

    public CarDtoResponse saveCar(CarDtoRequest carDtoRequest) {
        Car car = modelMapper.map(carDtoRequest, Car.class);
        this.carRepository.save(car);
        return modelMapper.map(car, CarDtoResponse.class);
    }

    public List<CarDtoResponse> listAll() {
        List<Car> car = carRepository.findAll();
        return car.stream().map(c -> modelMapper.map(c, CarDtoResponse.class)).collect(Collectors.toList());
    }

    public List<CarDtoResponse> findById(Long id){
        Optional<Car> car = carRepository.findById(id);
        return car.stream().map(c -> modelMapper.map(c, CarDtoResponse.class)).collect(Collectors.toList());
    }
}




