package org.example;

public class Kitap implements Yayin {
    private String isim;
    private String yazar;
    private double fiyat;

    public Kitap(String isim, String yazar, double fiyat) {
        this.isim = isim;
        this.yazar = yazar;
        this.fiyat = fiyat;
    }

    @Override
    public void bilgiYazdir() {
        System.out.println("Kitap: " + isim + " - Yazar: " + yazar + " - Fiyat: " + fiyat + " TL");
    }
    public double getFiyat() {
        return fiyat;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
}
