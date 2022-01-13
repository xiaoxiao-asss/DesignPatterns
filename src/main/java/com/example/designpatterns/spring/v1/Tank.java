package com.example.designpatterns.spring.v1;

import java.util.Random;

public class Tank {

    public void run()  {
        System.out.println("tank run.................");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
