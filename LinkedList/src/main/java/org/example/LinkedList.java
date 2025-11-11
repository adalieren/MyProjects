package org.example;

public class LinkedList {
    private Node head;

    public LinkedList(){
        this.head=null;
    }

    public void add(String data){
        Node newNode = new Node(data , null);

        if (head == null){
            head = newNode;
        }else{
            Node curr = head;
            while (curr.next != null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    public void yazdir(){
        Node curr = head;

        while(curr != null){
            System.out.print((curr.getData()) + "->");
            curr = curr.getNext();
        }
        System.out.print("null");
    }
}
