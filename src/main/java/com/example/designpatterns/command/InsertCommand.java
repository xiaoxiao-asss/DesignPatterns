package com.example.designpatterns.command;

public class InsertCommand implements Command {
    Content content;

    String str="xiaoxiao";

    public InsertCommand(Content content){
        this.content=content;
    }

    @Override
    public void doin() {
        content.msg=content.msg+str;


    }

    @Override
    public void undo() {
        content.msg=content.msg.substring(0,content.msg.length()-str.length());

    }
}
