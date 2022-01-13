package com.example.designpatterns.bridge.v2;

public class Friend {
    public static void deliver(User user) {
        Gift gift = new WaldGift();
        give(user, gift);
    }

    public static void give(User user, Gift gift) {
        System.out.println(user);
    }


    public static void main(String[] args) {

        deliver(new User());
    }


}
