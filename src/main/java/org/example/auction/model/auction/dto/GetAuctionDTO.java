package org.example.auction.model.auction.dto;

import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import org.example.auction.model.bid.Bid;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class GetAuctionDTO {
    private Long auctionId;
    private Long carId;
    private Long userId;
    private List<Bid> bids;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String description;
}
