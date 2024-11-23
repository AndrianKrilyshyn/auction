package org.example.auction.service;

import org.example.auction.model.auction.Auction;
import org.example.auction.model.auction.dto.GetAuctionDTO;
import org.example.auction.model.auction.dto.PostAuctionDTO;

public interface AuctionService {
    GetAuctionDTO getAuctionById(long id);
    GetAuctionDTO createAuction(PostAuctionDTO postAuctionDTO);
    GetAuctionDTO updateAuction(Auction auction);
    void deleteAuction(long id);
}
