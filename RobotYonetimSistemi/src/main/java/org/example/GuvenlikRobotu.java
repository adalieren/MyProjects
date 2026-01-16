package org.example;

public class GuvenlikRobotu extends Robot{

    public GuvenlikRobotu(String model, int bataryaSeviyesi){
        super(model, bataryaSeviyesi);
    }

    @Override
    void gorevYap(){
        System.out.println("Etraf taraniyor..");
    }
}
