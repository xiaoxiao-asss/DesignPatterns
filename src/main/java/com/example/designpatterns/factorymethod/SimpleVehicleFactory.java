package com.example.designpatterns.factorymethod;

import com.example.designpatterns.abstractfactory.Broom;

/**
 * 简单工厂的可扩展性不好
 */
public class SimpleVehicleFactory {

    public Car createCar() {
        //before processing
        return new Car();
    }

    public Broom createBroom() {
        return new Broom();
    }
}
