package com.example.designpatterns.builder;

public class Director implements TerrainBuilder{
    private Terrain terrain=new Terrain();


    @Override
    public TerrainBuilder getFort() {
        terrain.f=new Fort(1,2,3,4);
        return this;
    }

    @Override
    public TerrainBuilder getMine() {
        terrain.m=new Mine(5,6,7,8);
        return this;
    }

    @Override
    public TerrainBuilder getWall() {
       terrain.w=new Wall(9,10,11,12);
       return this;
    }

    @Override
    public Terrain geTerrain() {
        return terrain;
    }
}
