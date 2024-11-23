package org.example.auction.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.auction.model.car.Car;
import org.example.auction.model.car.dto.GetCarDTO;
import org.example.auction.model.car.dto.PostCarDTO;
import org.example.auction.model.car.mapper.CarMapper;
import org.example.auction.repository.CarRepo;
import org.example.auction.service.CarService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {
    private final CarRepo carRepo;
    private final CarMapper carMapper;

    @Override
    public GetCarDTO getCarById(long id) {
        return carMapper.toDTO(carRepo.findById(id).orElseThrow());
    }

    @Override
    public GetCarDTO createCar(PostCarDTO postCarDTO) {
        Car car = carMapper.toModel(postCarDTO);
        return carMapper.toDTO(carRepo.save(car));
    }

    @Override
    public GetCarDTO updateCar(Car car) {
        return carMapper.toDTO(carRepo.save(car));
    }

    @Override
    public void deleteCar(long id) {
        carRepo.deleteById(id);
    }
}
