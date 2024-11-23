package org.example.auction.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.auction.model.bid.Bid;
import org.example.auction.model.bid.dto.GetBidDTO;
import org.example.auction.model.bid.dto.PostBidDTO;
import org.example.auction.model.bid.mapper.BidMapper;
import org.example.auction.repository.BidRepo;
import org.example.auction.service.BidService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class BidServiceImpl implements BidService {
    private final BidRepo bidRepo;
    private final BidMapper bidMapper;

    @Override
    public GetBidDTO getBidById(long id) {
        return bidMapper.toGetBidDTO(bidRepo.findById(id).orElseThrow());
    }

    @Override
    public GetBidDTO createBid(PostBidDTO postBidDTO) {
        Bid bid = bidMapper.toBid(postBidDTO);
        bid.setBidTime(LocalDateTime.now());
        return bidMapper.toGetBidDTO(bidRepo.save(bid));
    }

    @Override
    public GetBidDTO updateBid(Bid bid) {
        return bidMapper.toGetBidDTO(bidRepo.save(bid));
    }

    @Override
    public void deleteBid(long id) {
        bidRepo.deleteById(id);
    }
}
