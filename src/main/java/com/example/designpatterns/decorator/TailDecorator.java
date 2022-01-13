package com.example.designpatterns.decorator;

public class TailDecorator extends GoDecorator {

    public TailDecorator(GameObject gameObject){
        this.gameObject=gameObject;
    }


    @Override
    public void display() {

        System.out.println("tailDecorator....");
        this.gameObject.display();
    }
}
