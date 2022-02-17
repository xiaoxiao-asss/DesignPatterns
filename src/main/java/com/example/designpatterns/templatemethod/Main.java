package com.example.designpatterns.templatemethod;

public class Main {

    public static void main(String[] args) {
        F f=new C1();
        f.m();
    }
}


abstract class F {
    public void m(){
        t1();
        t2();
    }

    abstract void t1();

    abstract void t2();
}

class C1 extends F {

    @Override
    void t1() {
        System.out.println("t1.....");
    }

    @Override
    void t2() {
        System.out.println("t2.....");
    }
}

