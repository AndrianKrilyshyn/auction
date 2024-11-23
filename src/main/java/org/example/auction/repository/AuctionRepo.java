package org.example.auction.repository;

import org.example.auction.model.auction.Auction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuctionRepo extends JpaRepository<Auction, Long> {
}
