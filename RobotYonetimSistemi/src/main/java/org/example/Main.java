package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        RobotKontrol kontrol = new RobotKontrol();

        TemizlikRobotu temizlikRobotu = new TemizlikRobotu("robot1",18);
        GuvenlikRobotu guvenlikRobotu = new GuvenlikRobotu("robot2",65);

        kontrol.robotEkle(temizlikRobotu);
        kontrol.robotEkle(guvenlikRobotu);
        kontrol.tumRobotlariCalistir();

    }
}