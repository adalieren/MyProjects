package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Node root = new Node(1);
        Node c1 = new Node(2);
        Node c2 = new Node(3);
        Node c3 = new Node(6);

        Methods ops = new Methods();
        Tree soyAgaci= ops.createTree(1);
        ops.addChild(soyAgaci.getRoot(),c1);
        ops.addChild(soyAgaci.getRoot(),c2);
        ops.addChild(c2,c3);


    }
}