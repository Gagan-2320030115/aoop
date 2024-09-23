package com.auction;

public class AuctionApp {
    public static void main(String[] args) {
        
        Auction auction = new Auction();
        Bidder bidder1 = new Bidder("Alice");
        Bidder bidder2 = new Bidder("Bob");

        
        auction.registerObserver(bidder1);
        auction.registerObserver(bidder2);

      
        auction.setAuctionItem("Vintage Car");
        auction.startBidding();

        System.out.println("---------------------");

     
        auction.endBidding();

        System.out.println("---------------------");

      
        auction.unregisterObserver(bidder1);
        auction.setAuctionItem("Classic Watch");
        auction.startBidding();
    }
}
