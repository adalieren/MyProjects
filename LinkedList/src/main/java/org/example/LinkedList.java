package org.example;

public class LinkedList {
    private Node head;

    public LinkedList(){
        this.head=null;
    }

    public void addToEnd(String data){
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

    public void addToStart(String data){
        Node newNode = new Node(data,null);

        newNode.next=head;
        head = newNode;

    }

    public void addAfter(String insertAfter ,String data){
        Node curr = head;

        if (curr != null){
            while(curr.data == insertAfter){
                Node newNode = new Node(data,null);
                newNode.next=curr.next;
                curr.next=newNode;
                break;
            }
            curr=curr.next;
        }
    }

    public void deleteLast(){
        Node curr = head;
        if(curr == null || curr.next == null){
            head = null;
            return;
        }
        Node nextNode = curr.next;
        while (curr.next != null){
            if(nextNode.next==null){
                curr.next = null;

            }
            curr = nextNode;
            nextNode = nextNode.next;

        }
        return;

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