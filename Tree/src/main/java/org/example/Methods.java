package org.example;

public class Methods {
    public Tree createTree(int data){
        return new Tree(data);
    }
    public void addChild(Node parent, Node child){
        parent.getChildren().add(child);
    }
}
