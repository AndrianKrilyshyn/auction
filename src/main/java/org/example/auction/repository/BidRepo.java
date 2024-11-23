package org.example.auction.repository;

import org.example.auction.model.bid.Bid;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BidRepo extends JpaRepository<Bid, Long> {
}
