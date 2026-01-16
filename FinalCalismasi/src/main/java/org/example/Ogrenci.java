package org.example;

public class Ogrenci {
    private String ad;
    private String soyad;
    private int id;
    private double vizeNotu;
    private double finalNotu;
    private double getHesapla;

    public Ogrenci() {
    }

    public Ogrenci(String ad, String soyad, int id, double vizeNotu, double finalNotu) {
        this.ad = ad;
        this.soyad = soyad;
        this.id = id;
        this.vizeNotu = vizeNotu;
        this.finalNotu = finalNotu;
    }

    public String getAd() {
        return ad;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }
    public String getSoyad() {
        return soyad;
    }
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getVizeNotu() {
        return vizeNotu;
    }
    public void setVizeNotu(double vizeNotu) {
        this.vizeNotu = vizeNotu;
    }
    public double getHesapla() {
        return (vizeNotu * 0.4 + finalNotu * 0.6);
    }

    public double getFinalNotu() {
        return finalNotu;
    }
    public void setFinalNotu(double finalNotu) {
        this.finalNotu = finalNotu;
    }
}