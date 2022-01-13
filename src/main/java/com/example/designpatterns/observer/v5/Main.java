package com.example.designpatterns.observer.v5;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      Child child=new Child();
      child.wakeUp();
    }
}

class Child{
    private boolean cry=false;

    List<Observer> list=new ArrayList<>();

    {
        list.add(new Dad());
        list.add(new Mom());
    }


    public boolean isCry() {
        return cry;
    }

    public void wakeUp(){
        cry=true;
        System.out.println("孩子醒来");
        for (Observer observer : list) {
            observer.feed();
        }
    }
}

interface Observer{
    void feed();
}

class Dad implements Observer {

    @Override
    public void feed(){
        System.out.println("喂饭。。。。。。。");
    }
}

class Mom implements Observer{

    @Override
    public void feed(){
        System.out.println("泡奶。。。。。。。");
    }
}

