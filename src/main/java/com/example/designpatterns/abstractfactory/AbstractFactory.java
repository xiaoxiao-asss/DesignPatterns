package com.example.designpatterns.abstractfactory;

public abstract class AbstractFactory {

    abstract Food createFood();

    abstract Vehicle createVehicle();

    abstract Weapon createWeapon();
}
