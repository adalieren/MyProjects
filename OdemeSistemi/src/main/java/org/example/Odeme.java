package org.example;

public class Odeme implements OdemeYontemi{
    private String musteriAdi;
    private int islemID;

    public Odeme(String musteriAdi, int islemID) {
        this.musteriAdi = musteriAdi;
        this.islemID = islemID;
    }

    @Override
    public void OdemeYap(double tutar) {
        System.out.println(musteriAdi + "adli kullanici" + tutar + "Tl ödeme yapti");
    }

    public String getMusteriAdi() {
        return musteriAdi;
    }
}
