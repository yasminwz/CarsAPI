package br.com.yasmin.cars.dto;

import lombok.Data;

@Data
public class CarDtoResponse {

    private Long chassis;

    private String name;

    private String brand;

    private String color;

    private Integer fabricationYear;

}
