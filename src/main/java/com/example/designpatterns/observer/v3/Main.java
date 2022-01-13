package com.example.designpatterns.observer.v3;


public class Main {
    public static void main(String[] args) {
      Child child=new Child(new Dad());
      child.wakeUp();
    }
}

class Child{
    private boolean cry=false;

    private Dad dad;

    public Child(Dad dad){
        this.dad=dad;
    }

    public boolean isCry() {
        return cry;
    }

    public void wakeUp(){
        cry=true;
        System.out.println("孩子醒来");
        dad.feed();
    }
}

class Dad{
    public void feed(){
        System.out.println("喂饭。。。。。。。");
    }
}
