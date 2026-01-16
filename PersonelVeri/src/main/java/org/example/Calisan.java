package org.example;

public class Calisan {
    private String isim;
    private String departman;
    private double maas;

    public Calisan(String isim, String departman, double maas) {
        this.isim = isim;
        this.departman = departman;
        this.maas = maas;
    }

    public String getIsim() {
        return isim;
    }

    public String getDepartman() {
        return departman;
    }

    public double getMaas() {
        return maas;
    }
}
