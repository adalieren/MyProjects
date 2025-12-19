package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DepthFirstSearch dfs = new DepthFirstSearch();
        List<Integer> list = new ArrayList<>();
        Node<Integer> root = new Node<>(4);
        root.setLeft(new Node<>(6));
        root.getLeft().setLeft(new Node<>(1));
        root.getLeft().getLeft().setLeft(new Node<>(0));
        root.setRight(new Node<>(2));
        root.getRight().setLeft(new Node<>(20));

        System.out.println("PreOrder:");
        dfs.preorder(root,list);
        System.out.println("");

        System.out.println("InOrder:");
        dfs.inOrder(root,list);
        System.out.println("");
        System.out.println("PostOrder:");
        dfs.postOrder(root,list);
    }
}