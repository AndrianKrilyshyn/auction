package org.example.auction.model.car.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetCarDTO {
    private Long carId;
    private Long userId;
    private String model;
    private String year;
    private String startingPrice;
    private String description;
}
