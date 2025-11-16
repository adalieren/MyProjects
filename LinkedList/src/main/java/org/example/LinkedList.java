package org.example;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addToEnd(String data) {
        Node newNode = new Node(data, null);

        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    public void addToStart(String data) {
        Node newNode = new Node(data, null);

        newNode.next = head;
        head = newNode;

    }

    public void addAfter(String insertAfter, String data) {
        Node curr = head;

        while (curr != null) {
            if (curr.data.equals(insertAfter)) {
                Node newNode = new Node(data, curr.next);
                curr.next = newNode;
                return;
            }
            curr = curr.next;
        }
    }

    public void deleteLast() {
        Node curr = head;
        if (curr == null || curr.next == null) {
            head = null;
            return;
        }
        Node nextNode = curr.next;
        while (curr.next != null) {
            if (nextNode.next == null) {
                curr.next = null;

            }
            curr = nextNode;
            nextNode = nextNode.next;

        }
        return;

    }

    public int NodeLength(Node head) {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    /*public int findMiddle(Node head) {
        int size = 0;
        Node temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int minIndex = size / 2;
        temp = head;
        for (int i = 1; i < minIndex; i++) {
            temp = temp.next;
        }

    }*/


    public void yazdir() {
        Node curr = head;

        while (curr != null) {
            System.out.print((curr.getData()) + "->");
            curr = curr.getNext();
        }
        System.out.print("null");
    }
}