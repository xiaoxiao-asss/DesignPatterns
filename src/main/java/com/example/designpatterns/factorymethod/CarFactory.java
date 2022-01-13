package com.example.designpatterns.factorymethod;

public class CarFactory {

    public Moveable create(){
        System.out.println("a car");
        return new Car();
    }
}
