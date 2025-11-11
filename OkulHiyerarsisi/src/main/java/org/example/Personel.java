package org.example;

public class Personel extends Kisi{
    private String alan;
    private double maas;

    @Override
    public void kisiBilgisi() {
        System.out.println("Personel: " + ad + " "+ soyad + ", Alan: " + alan + ", Maas: " + maas);
    }

    public Personel(String ad, String soyad , int yas, String alan, double maas) {
        super(ad, soyad, yas);
        this.alan = alan;
        this.maas = maas;
    }

    public String getAlan() {
        return alan;
    }

    public void setAlan(String alan) {
        this.alan = alan;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }
}
