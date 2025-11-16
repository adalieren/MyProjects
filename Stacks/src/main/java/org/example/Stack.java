package org.example;

public class Stack {
    private int[] Stack;
    private int top;
    private int size;

    public Stack(int size){
    Stack = new int[size];
    this.size = size;
    top = -1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == size-1;
    }
    public void push(int data){
        if(isFull()){
            System.out.println("Stack is full");
        return;
        }
        Stack[++top]=data;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int removed = Stack[top--];
        return removed;
    }
    public int getTop(){
    if(isEmpty()){
        System.out.println("Stack is empty");
        return -1;
    }
    return Stack[top];
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        for(int i=top; i>=0; i--){
            System.out.print(Stack[i]+" ");

        }

    }

}
