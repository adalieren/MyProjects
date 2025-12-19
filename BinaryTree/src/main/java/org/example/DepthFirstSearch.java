package org.example;

import java.util.List;

public class DepthFirstSearch<T> {
    public void preorder(Node<T> node, List<T> print) {
        if (node == null){
            return;
        }
        System.out.print(node.getData() + " "); //root değeri
        preorder(node.getLeft(), print);
        preorder(node.getRight(), print);
    }

    public void inOrder(Node<T> node, List<T> print){
        if (node == null){
            return;
        }
        inOrder(node.getLeft(), print);
        System.out.print(node.getData() + " ");
        inOrder(node.getRight(), print);
    }

    public void postOrder(Node<T> node, List<T> print){
        if (node == null){
            return;
        }
        postOrder(node.getLeft(), print);
        postOrder(node.getRight(), print);
        System.out.print(node.getData() + " ");
    }
}
