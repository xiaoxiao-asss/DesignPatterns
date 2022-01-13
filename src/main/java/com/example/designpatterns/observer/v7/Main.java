package com.example.designpatterns.observer.v7;


import java.util.ArrayList;
import java.util.List;

/**
 * 有很多时候，观察者需要根据事件的具体情况来进行处理
 */
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
        WakeUpEvent event=new WakeUpEvent(System.currentTimeMillis(),"bed",this);
        for (Observer observer : list) {
            observer.feed(event);
        }
    }
}

class WakeUpEvent{
    long timestamp;
    String loc;
    Child source;

    public WakeUpEvent(long timestamp, String loc, Child source) {
        this.timestamp = timestamp;
        this.loc = loc;
        this.source = source;
    }
}

interface Observer{
    void feed(WakeUpEvent wakeUpEvent);
}

class Dad implements Observer {

    @Override
    public void feed(WakeUpEvent wakeUpEvent){
        System.out.println("喂饭。。。。。。。");
    }
}

class Mom implements Observer {

    @Override
    public void feed(WakeUpEvent wakeUpEvent){
        System.out.println("泡奶。。。。。。。");
    }
}

