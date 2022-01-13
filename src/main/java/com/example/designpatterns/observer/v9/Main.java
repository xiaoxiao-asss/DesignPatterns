package com.example.designpatterns.observer.v9;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Button button=new Button();
        button.add(new MyActionListener());
        button.add(new MyActionListener2());
        button.clik();


    }
}

class Button{
    List<ActionListener> actionListenerList=new ArrayList<>();

    public void add(ActionListener listener){
        actionListenerList.add(listener);
    }

    public void clik(){
        System.out.println("点击。。。。。");
        ActionEvent event=new ActionEvent(System.currentTimeMillis(),this);
        for (ActionListener actionListener : actionListenerList) {
            actionListener.process(event);
        }
    }

}


interface ActionListener{

     void process(ActionEvent event);
}

class MyActionListener implements ActionListener {

    @Override
    public void process(ActionEvent event) {
        System.out.println("MyActionListener1.....");
    }
}

class MyActionListener2 implements ActionListener {

    @Override
    public void process(ActionEvent event) {
        System.out.println("MyActionListener2.....");
    }
}


class ActionEvent{
    long when;
    Object source;

    public ActionEvent(long when, Object source) {
        this.when = when;
        this.source = source;
    }

    public long getWhen() {
        return when;
    }

    public Object getSource() {
        return source;
    }
}