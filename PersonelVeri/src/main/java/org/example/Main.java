package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SirketYonetimi sirket=new SirketYonetimi();
        sirket.verileriYukle();

        // Yazılımcıları filtrele ve yazdır
        sirket.yazilimcilariListele();

        // Filtreleme ve Sayma işlemi sonucu
        System.out.println("\n50.000 TL Üzeri Maaş Alan Kişi Sayısı: " + sirket.yuksekMaaslilariSay());

        // Ortalama hesaplama sonucu
        System.out.printf("Şirket Genel Maaş Ortalaması: %.2f TL\n", sirket.maasOrtalamasi());

        // Sıralama işlemi sonucu
        sirket.ismeGoreSirala();
    }
}