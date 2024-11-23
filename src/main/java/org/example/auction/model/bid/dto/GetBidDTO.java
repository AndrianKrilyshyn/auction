package org.example.auction.model.bid.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class GetBidDTO {
    private Long bidId;
    private Long auctionId;
    private Long userId;
    private String bidAmount;
    private LocalDateTime bidTime;
}
