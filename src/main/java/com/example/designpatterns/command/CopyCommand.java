package com.example.designpatterns.command;

public class CopyCommand implements Command {

    Content content;

    public CopyCommand(Content content){
        this.content=content;
    }



    @Override
    public void doin() {
        content.msg=content.msg+content.msg;
    }

    @Override
    public void undo() {
        content.msg=content.msg.substring(0,content.msg.length()/2);

    }
}
