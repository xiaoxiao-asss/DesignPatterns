package com.example.designpatterns.command;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Content content=new Content();
        InsertCommand insertCommand=new InsertCommand(content);
        insertCommand.doin();
        insertCommand.undo();

        CopyCommand copyCommand=new CopyCommand(content);
        copyCommand.doin();
        copyCommand.undo();

        DeleteCommand deleteCommand=new DeleteCommand(content);
        deleteCommand.doin();
        deleteCommand.undo();


        List<Command> commands=new ArrayList<>();
        commands.add(new InsertCommand(content) );
        commands.add(new CopyCommand(content));
        commands.add(new DeleteCommand(content));

        for (Command command : commands) {
            command.doin();
        }

        for (int i =commands.size()-1; i >=0; i--) {
            commands.get(i).undo();
        }

        System.out.println(content.msg);

    }
}
