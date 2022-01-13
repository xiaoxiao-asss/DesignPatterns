package com.example.designpatterns.decorator;

public class RectDecorator extends GoDecorator {

    public RectDecorator(GameObject gameObject){
        this.gameObject=gameObject;
    }


    @Override
    public void display() {
        System.out.println("rectDecorator..");
        this.gameObject.display();


    }
}
