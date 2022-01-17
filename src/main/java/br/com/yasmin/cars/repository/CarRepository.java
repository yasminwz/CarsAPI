package br.com.yasmin.cars.repository;

import br.com.yasmin.cars.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CarRepository extends JpaRepository<Car, Long> {


}
