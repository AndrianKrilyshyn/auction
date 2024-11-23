package org.example.auction.model.bid.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class PostBidDTO {
    private Long auctionId;
    private Long userId;
    private String bidAmount;
}
