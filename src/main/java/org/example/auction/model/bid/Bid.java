package org.example.auction.model.bid;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.example.auction.model.auction.Auction;
import org.example.auction.model.user.User;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Bid {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bidId;
    private Long auctionId;
    private Long userId;
    private String bidAmount;
    private LocalDateTime bidTime;
}
