package org.example;

public class Tree {
    private Node root;

    public Tree(int data) {
        this.root = new Node(data);
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
}
