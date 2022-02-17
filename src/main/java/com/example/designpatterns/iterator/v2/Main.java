package com.example.designpatterns.iterator.v2;

public class Main {

    public static void main(String[] args) {
        LinkedList_ list=new LinkedList_();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list.size());


    }
}

class LinkedList_{

    Node head=null;

    Node tail=null;

   int index=0;

    public void add(Object object) {
        Node node=new Node(object);

        if(tail==null){
            tail=node;
            head=node;
        }

        tail.next=node;
        tail=node;
        index++;
    }


    public int size(){
        return index;
    }

    private class Node {
        Object object;
        Node next;

        public Node(Object object) {
            this.object = object;
        }
    }

}


