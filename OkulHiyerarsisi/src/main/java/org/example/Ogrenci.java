package org.example;

public class Ogrenci extends Kisi {
    private int ogrenciNo;
    private int sinif;
    private String bolum;

    @Override
    public void kisiBilgisi() {
        System.out.println("Öğrenci: " + ad + " "+  soyad +" Yaş: " + yas + " No: " + ogrenciNo + "Sınıf:" + sinif + "Bölüm:" + bolum);
    }

    public Ogrenci(String ad, String soyad, int yas, int ogrenciNo, int sinif, String bolum) {
        super(ad, soyad, yas);
        this.ogrenciNo = ogrenciNo;
        this.sinif = sinif;
        this.bolum = bolum;
    }

    public int getSinif() {
        return sinif;
    }

    public void setSinif(int sinif) {
        this.sinif = sinif;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

}
