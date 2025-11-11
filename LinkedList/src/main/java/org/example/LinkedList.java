package org.example;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head=null;
    }


    public void add(String data){
        Node node = new Node(data,null);

        if (head == null){
            head = node;
        }
        else{
            Node current = head;
            while (current.next != null ){
                current = current.next;
            }
            current.next= node;
        }
    }

public void yaz() {
    Node current = head;
    while(current != null){
        System.out.print((current.getData())+ "->");
        current = current.getNext();
    }
    System.out.print("null");
}
}
