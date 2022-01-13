package com.example.designpatterns.observer.v9;


import java.awt.*;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestFrame extends Frame {

    public void launch(){
        Button button=new Button();
        button.setLabel("button");
        button.addActionListener(new Listener1());
        button.addActionListener(new Listener2());
        this.add(button);
        this.pack();

        this.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
               System.exit(0);
            }
        });
        this.setLocation(400,400);

        this.setVisible(true);


    }



    public static void main(String[] args){
        new TestFrame().launch();
    }
}


class Listener1 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        ((Button)e.getSource()).setLabel("click again");
        System.out.println("Listener1。。。。。。");
    }
}

class Listener2 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Listener2。。。。。。");
    }
}