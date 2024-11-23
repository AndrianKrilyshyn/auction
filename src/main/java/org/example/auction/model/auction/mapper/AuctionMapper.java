package org.example.auction.model.auction.mapper;

import org.example.auction.model.auction.Auction;
import org.example.auction.model.auction.dto.GetAuctionDTO;
import org.example.auction.model.auction.dto.PostAuctionDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;

@Mapper(config = MapperConfig.class)
public interface AuctionMapper {
    Auction toAuction(PostAuctionDTO postAuctionDTO);
    GetAuctionDTO toGetAuctionDTO(Auction auction);
    Auction toAuction(GetAuctionDTO getAuctionDTO);
}
