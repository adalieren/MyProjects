package org.example;

public class Ogretmen extends Kisi {
    private String bolum;
    private int tecrube;
    private double maas;

    @Override
    public void kisiBilgisi() {
        System.out.println("Öğretmen: " + ad + " " + soyad + ", Bölüm: " + bolum + "Tecrübe:"+ tecrube + "Yıl" + ", Maaş: " + maas + "TL");
    }

    public Ogretmen(String ad, String soyad, int yas, int tecrube, String bolum, double maas) {
        super(ad, soyad, yas);
        this.tecrube = tecrube;
        this.bolum = bolum;
        this.maas = maas;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getTecrube() {
        return tecrube;
    }

    public void setTecrube(int tecrube) {
        this.tecrube = tecrube;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

}
