package com.example.designpatterns.command;

public class DeleteCommand implements Command {

    Content content;

    String deleteStr;

    public DeleteCommand(Content content){
        this.content=content;
    }

    @Override
    public void doin() {
        deleteStr=content.msg.substring(0,5);
        content.msg=content.msg.substring(5,content.msg.length());

    }

    @Override
    public void undo() {
        content.msg=deleteStr+content.msg;
    }
}
