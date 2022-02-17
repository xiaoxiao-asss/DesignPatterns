package com.example.designpatterns.visitor;

public class Computer {
    ComputerPart part1 = new CPU();
    ComputerPart part2 = new Memory();
    ComputerPart part3 = new Board();

    public void accept(Visitor visitor){
        this.part1.accept(visitor);
        this.part2.accept(visitor);
        this.part3.accept(visitor);
    }

    public static void main(String[] args) {
        PeopleVisitor peopleVisitor = new PeopleVisitor();
        new Computer().accept(peopleVisitor);
        System.out.println(peopleVisitor.totalPrice);
    }
}

abstract class ComputerPart {
    abstract void accept(Visitor visitor);

    abstract double getPrice();
}

class CPU extends ComputerPart {

    @Override
    void accept(Visitor visitor) {
        visitor.visitCpu(this);
    }

    @Override
    double getPrice() {
        return 100;
    }
}

class Memory extends ComputerPart {

    @Override
    void accept(Visitor visitor) {
        visitor.visitMemory(this);
    }

    @Override
    double getPrice() {
        return 200;
    }
}

class Board extends ComputerPart {

    @Override
    void accept(Visitor visitor) {
        visitor.visitBoard(this);
    }

    @Override
    double getPrice() {
        return 300;
    }
}


interface Visitor {
    void visitCpu(CPU cpu);

    void visitMemory(Memory memory);

    void visitBoard(Board board);
}

class PeopleVisitor implements Visitor {

    double totalPrice;

    @Override
    public void visitCpu(CPU cpu) {
        totalPrice += cpu.getPrice() * 0.9;
    }

    @Override
    public void visitMemory(Memory memory) {
        totalPrice += memory.getPrice() * 0.9;
    }

    @Override
    public void visitBoard(Board board) {
        totalPrice += board.getPrice() * 0.9;
    }
}

class CorpVisitor implements Visitor {

    double totalPrice;

    @Override
    public void visitCpu(CPU cpu) {
        totalPrice += cpu.getPrice() * 0.6;
    }

    @Override
    public void visitMemory(Memory memory) {
        totalPrice += memory.getPrice() * 0.6;
    }

    @Override
    public void visitBoard(Board board) {
        totalPrice += board.getPrice() * 0.6;
    }
}

