package org.example.auction.service;

import org.example.auction.model.bid.Bid;
import org.example.auction.model.bid.dto.GetBidDTO;
import org.example.auction.model.bid.dto.PostBidDTO;

public interface BidService {
    GetBidDTO getBidById(long id);
    GetBidDTO createBid(PostBidDTO postBidDTO);
    GetBidDTO updateBid(Bid bid);
    void deleteBid(long id);
}
