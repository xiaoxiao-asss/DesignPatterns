package com.example.designpatterns.bridge.v1;

public class Friend {
    public static void deliver(User user) {
        Gift gift = new Book();
        give(user, gift);
    }

    public static void give(User user, Gift gift) {
        System.out.println(user);
    }


    public static void main(String[] args) {

        deliver(new User());
    }


}
