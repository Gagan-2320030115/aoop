package com.auction;

import java.util.ArrayList;
import java.util.List;

// Step 3.3: Implement the Subject interface in the Auction class
public class Auction implements Subject {
    private List<Observer> observers;
    private String auctionItem;

    public Auction() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void setAuctionItem(String item) {
        this.auctionItem = item;
        notifyObservers("New auction item: " + item);
    }

    public void startBidding() {
        notifyObservers("Bidding has started for item: " + auctionItem);
    }

    public void endBidding() {
        notifyObservers("Bidding has ended for item: " + auctionItem);
    }
}
