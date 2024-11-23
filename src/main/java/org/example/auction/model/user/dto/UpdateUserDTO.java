package org.example.auction.model.user.dto;

import lombok.Getter;
import lombok.Setter;
import org.example.auction.model.auction.Auction;
import org.example.auction.model.bid.Bid;
import org.example.auction.model.car.Car;
import org.example.auction.model.role.Role;

import java.util.List;

@Getter
@Setter
public class UpdateUserDTO {
    private String firstName;
    private String lastName;
    private String email;
    private Role role;
    private List<Auction> auctions;
    private List<Car> cars;
    private List<Bid> bids;
}
