package org.example;

abstract class Robot {
    private String model;
    private int bataryaSeviyesi;

    public Robot(String model, int bataryaSeviyesi) {
        this.model = model;
        this.bataryaSeviyesi = bataryaSeviyesi;
    }

    abstract void gorevYap();

    public void sarjEt(){
        System.out.println(model + "sarj ediliyor.");
        this.bataryaSeviyesi = 100;
    }




    public int getBataryaSeviyesi() {
        return bataryaSeviyesi;
    }

    public void setBataryaSeviyesi(int bataryaSeviyesi) {
        this.bataryaSeviyesi = bataryaSeviyesi;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
