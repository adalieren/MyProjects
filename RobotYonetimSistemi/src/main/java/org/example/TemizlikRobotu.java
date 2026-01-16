package org.example;

public class TemizlikRobotu extends Robot {

    public TemizlikRobotu(String model ,int bataryaSeviyesi) {
        super(model, bataryaSeviyesi);
    }

    @Override
    void gorevYap() {
        System.out.println("Temizlige baslaniyor..");
    }
}
