package org.example.auction.model.car.mapper;

import org.example.auction.model.car.Car;
import org.example.auction.model.car.dto.GetCarDTO;
import org.example.auction.model.car.dto.PostCarDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;

@Mapper(config = MapperConfig.class)
public interface CarMapper {
    Car toModel(PostCarDTO postCarDTO);
    GetCarDTO toDTO(Car car);
    Car toModel(GetCarDTO getCarDTO);
}
