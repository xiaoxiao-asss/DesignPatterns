package com.example.designpatterns.bridge.v4;

public class WarmGift extends Gift {

    public WarmGift(SpecificGift specificGift) {
        this.specificGift=specificGift;
    }
}
