package org.example.auction.service;

import org.example.auction.model.car.Car;
import org.example.auction.model.car.dto.GetCarDTO;
import org.example.auction.model.car.dto.PostCarDTO;

public interface CarService {
    GetCarDTO getCarById(long id);
    GetCarDTO createCar(PostCarDTO postCarDTO);
    GetCarDTO updateCar(Car car);
    void deleteCar(long id);

}
