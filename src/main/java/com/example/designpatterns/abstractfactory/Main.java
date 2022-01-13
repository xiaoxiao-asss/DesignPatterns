package com.example.designpatterns.abstractfactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory factory=new MagicFactory();
        factory.createFood().printName();
        factory.createVehicle().go();
        factory.createWeapon().shoot();
    }
}
