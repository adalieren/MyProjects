package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*
        int a = 10;
        int b = 0;
        System.out.println(a / b);
*/
        try{
            int c = 10;
            int d= 0;
            System.out.println(c / d);
    }
        catch (ArithmeticException e){
            System.out.println("Sıfıra bölme hatası");
        }
}
}