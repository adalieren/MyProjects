package org.example;

import java.util.ArrayList;

public class RobotKontrol{
    private ArrayList<Robot> robotlar;

    public RobotKontrol() {
        this.robotlar = new ArrayList<>();
    }
    public void robotEkle(Robot r) {
        this.robotlar.add(r);
    }
    public void tumRobotlariCalistir(){
        for(Robot r: this.robotlar) {
            r.gorevYap();
            if (r.getBataryaSeviyesi() < 20){
                r.sarjEt();
            }
        }
    }
}
