package com.example.designpatterns.bridge.v4;

public class WaldGift extends Gift {

    public WaldGift(SpecificGift specificGift) {
        this.specificGift=specificGift;
    }
}
