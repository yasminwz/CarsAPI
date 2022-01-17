package br.com.yasmin.cars.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class CarDtoRequest {

    private String name;

    private String brand;

    private String color;

    private Integer fabricationYear;

}
