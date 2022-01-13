package com.example.designpatterns.observer.v2;

public class Main {
    public static void main(String[] args) {
        Child child=new Child();
        while (!child.isCry()){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("observing....");
        }
    }
}


class Child{
   private boolean cry=false;

    public boolean isCry() {
        return cry;
    }

    public void wakeUp(){
        cry=true;

        System.out.println("哭");
    }
}



