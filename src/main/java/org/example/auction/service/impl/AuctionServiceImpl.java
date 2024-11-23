package org.example.auction.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.auction.model.auction.Auction;
import org.example.auction.model.auction.dto.GetAuctionDTO;
import org.example.auction.model.auction.dto.PostAuctionDTO;
import org.example.auction.model.auction.mapper.AuctionMapper;
import org.example.auction.repository.AuctionRepo;
import org.example.auction.service.AuctionService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuctionServiceImpl implements AuctionService {
    private final AuctionMapper auctionMapper;
    private final AuctionRepo auctionRepo;
    @Override
    public GetAuctionDTO getAuctionById(long id) {
        return auctionMapper.toGetAuctionDTO(auctionRepo.findById(id).orElseThrow());
    }

    @Override
    public GetAuctionDTO createAuction(PostAuctionDTO postAuctionDTO) {
        Auction auction = auctionMapper.toAuction(postAuctionDTO);
        return auctionMapper.toGetAuctionDTO(auctionRepo.save(auction));
    }

    @Override
    public GetAuctionDTO updateAuction(Auction auction) {
        return auctionMapper.toGetAuctionDTO(auctionRepo.save(auction));
    }

    @Override
    public void deleteAuction(long id) {
        auctionRepo.deleteById(id);
    }
}
