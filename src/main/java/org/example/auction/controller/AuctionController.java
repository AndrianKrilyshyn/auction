package org.example.auction.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.example.auction.model.auction.Auction;
import org.example.auction.model.auction.dto.GetAuctionDTO;
import org.example.auction.model.auction.dto.PostAuctionDTO;
import org.example.auction.model.auction.mapper.AuctionMapper;
import org.example.auction.service.AuctionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/auction")
@RequiredArgsConstructor
public class AuctionController {
    private final AuctionService auctionService;
    private final AuctionMapper auctionMapper;
    @GetMapping("/{id}")
    public GetAuctionDTO getAuction(@PathVariable long id) {
        return auctionService.getAuctionById(id);
    }
    @PostMapping("/create")
    GetAuctionDTO createAuction(@RequestBody PostAuctionDTO postAuctionDTO){
        return auctionService.createAuction(postAuctionDTO);
    }
    @PostMapping("/{id}")
    public GetAuctionDTO updateAuction(@PathVariable long id, @RequestBody PostAuctionDTO postAuctionDTO){
        Auction auction = auctionMapper.toAuction(auctionService.getAuctionById(id));
        auction.setDescription(postAuctionDTO.getDescription());
        auction.setCarId(postAuctionDTO.getCarId());
        auction.setUserId(postAuctionDTO.getUserId());
        auction.setStartTime(postAuctionDTO.getStartTime());
        auction.setEndTime(postAuctionDTO.getEndTime());
        return auctionService.updateAuction(auction);
    }
    @PostMapping("/del{id}")
    public void deleteAuction(@PathVariable long id){
        auctionService.deleteAuction(id);
    }

}
