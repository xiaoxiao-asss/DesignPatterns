package com.example.designpatterns.observer.v4;



public class Main {
    public static void main(String[] args) {
      Child child=new Child();
      child.wakeUp();
    }
}

class Child{
    private boolean cry=false;

    private Dad dad=new Dad();
    private Mom mom=new Mom();


    public boolean isCry() {
        return cry;
    }

    public void wakeUp(){
        cry=true;
        System.out.println("孩子醒来");
        dad.feed();
        mom.feed();
    }
}

class Dad{
    public void feed(){
        System.out.println("喂饭。。。。。。。");
    }
}

class Mom{
    public void feed(){
        System.out.println("泡奶。。。。。。。");
    }

}

