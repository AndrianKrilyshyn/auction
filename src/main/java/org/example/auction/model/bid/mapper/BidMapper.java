package org.example.auction.model.bid.mapper;

import org.example.auction.model.bid.Bid;
import org.example.auction.model.bid.dto.GetBidDTO;
import org.example.auction.model.bid.dto.PostBidDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.Mapping;

@Mapper(config = MapperConfig.class)
public interface BidMapper {
    Bid toBid(PostBidDTO postBidDTO);
    GetBidDTO toGetBidDTO(Bid bid);
    Bid toBid(GetBidDTO getBidDTO);
}
