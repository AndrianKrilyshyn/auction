package org.example.auction.controller;

import lombok.RequiredArgsConstructor;
import org.example.auction.model.bid.Bid;
import org.example.auction.model.bid.dto.GetBidDTO;
import org.example.auction.model.bid.dto.PostBidDTO;
import org.example.auction.model.bid.mapper.BidMapper;
import org.example.auction.service.BidService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/bid")
@RequiredArgsConstructor
public class BidController {
    private final BidService bidService;
    private final BidMapper bidMapper;
    @GetMapping("/{id}")
    public GetBidDTO getBid(@PathVariable long id) {
        return bidService.getBidById(id);
    }
    @PostMapping("/create")
    public GetBidDTO createBid(@RequestBody PostBidDTO postBidDTO) {
        return bidService.createBid(postBidDTO);
    }
    @PostMapping("/{id}")
    public GetBidDTO updateBid(@PathVariable long id, @RequestBody PostBidDTO postBidDTO) {
        Bid bid = bidMapper.toBid(getBid(id));
        bid.setBidTime(LocalDateTime.now());
        bid.setBidAmount(postBidDTO.getBidAmount());
        bid.setAuctionId(postBidDTO.getAuctionId());
        bid.setUserId(postBidDTO.getUserId());
        return bidService.updateBid(bid);
    }
    @PostMapping("/del{id}")
    public void deleteBid(@PathVariable long id) {
        bidService.deleteBid(id);
    }
}
