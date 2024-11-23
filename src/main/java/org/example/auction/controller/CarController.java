package org.example.auction.controller;

import lombok.RequiredArgsConstructor;
import org.example.auction.model.car.Car;
import org.example.auction.model.car.dto.GetCarDTO;
import org.example.auction.model.car.dto.PostCarDTO;
import org.example.auction.model.car.mapper.CarMapper;
import org.example.auction.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/car")
public class CarController {
    private final CarService carService;
    private final CarMapper carMapper;
    @GetMapping("/{id}")
    GetCarDTO getCar(@PathVariable int id) {
        return carService.getCarById(id);
    }
    @PostMapping("/{id}")
    GetCarDTO updateCar(@PathVariable int id, @RequestBody PostCarDTO postCarDTO) {
        Car car = carMapper.toModel(carService.getCarById(id));
        car.setYear(postCarDTO.getYear());
        car.setModel(postCarDTO.getModel());
        car.setUserId(postCarDTO.getUserId());
        car.setStartingPrice(postCarDTO.getStartingPrice());
        car.setDescription(postCarDTO.getDescription());
        return carService.updateCar(car);
    }
    @PostMapping("/create")
    public GetCarDTO createCar(@RequestBody PostCarDTO postCarDTO) {
        return carService.createCar(postCarDTO);
    }
    @PostMapping("/del{id}")
    public void deleteCar(@PathVariable int id) {
        carService.deleteCar(id);
    }

}
