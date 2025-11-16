package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack(6);

        stack.push(10);
        stack.push(24);
        stack.push(16);
        stack.push(29);
        stack.push(37);
        stack.push(51);

        System.out.println(stack.getTop());
        stack.pop();
        stack.display();

    }
}