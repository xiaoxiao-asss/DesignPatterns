package com.example.designpatterns.builder;

public interface TerrainBuilder {

    TerrainBuilder getFort();
    TerrainBuilder getMine();
    TerrainBuilder getWall();

    Terrain geTerrain();







}
