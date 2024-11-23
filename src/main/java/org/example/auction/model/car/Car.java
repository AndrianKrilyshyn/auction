package org.example.auction.model.car;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.example.auction.model.user.User;

@Setter
@Getter
@NoArgsConstructor
@ToString
@Entity
public class Car {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long carId;
        private Long userId;
        private String model;
        private String year;
        private String startingPrice;
        private String description;
}
