package com.example.designpatterns.builder;

public class Main {
    public static void main(String[] args) {
        TerrainBuilder director = new Director().getFort().getMine().getWall();
        System.out.println( director.geTerrain());


        User user = new User.UserBuilder()
                .age(10)
                .description("ddddddd")
                .name(1, "test")
                .user();

        System.out.println(user);

    }
}
