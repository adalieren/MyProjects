package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {
            int[] sayilar = {1, 2, 3};
            System.out.println(sayilar[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Gecersiz indis");
        }finally {
            System.out.println("The 'try catch' is finished.");
        }
        Methods methods = new Methods();
        methods.checkAge(15);
        methods.checkAge(21);

    }
}



