package org.example.auction.repository;

import org.example.auction.model.car.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Car, Long> {
}
