package org.example.auction.model.auction;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.example.auction.model.bid.Bid;
import org.example.auction.model.car.Car;
import org.example.auction.model.user.User;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Auction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long auctionId;
    private Long carId;
    private Long userId;
    @OneToMany
    private List<Bid> bids;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String description;
}

