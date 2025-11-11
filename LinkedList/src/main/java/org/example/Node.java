package org.example;

public class Node {
    private String data;
    Node next=null;

    public Node (String data, Node next){
        this.data = data;
        this.next=next;
    }

    public Node getNext() {
        return next;
    }
    public void setNext(Node next){
        this.next=next;
    }
    public String getData(){
        return data;
    }
    public void setData(String data){
        this.data=data;
    }
}
