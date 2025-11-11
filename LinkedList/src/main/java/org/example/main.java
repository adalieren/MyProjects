package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addToEnd("This");
        list.addToEnd("is");
        list.addToEnd("a");
        list.addToEnd("list");

        list.yazdir();

        
        list.deleteLast();

        list.yazdir();
    }
}
