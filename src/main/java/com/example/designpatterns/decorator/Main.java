package com.example.designpatterns.decorator;

public class Main {
    public static void main(String[] args) {
        GoDecorator decorator=new RectDecorator(new Bullet());

        GoDecorator decorator1=new TailDecorator(decorator);
        decorator1.display();

    }
}
