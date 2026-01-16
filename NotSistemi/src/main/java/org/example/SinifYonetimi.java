package org.example;


import java.util.ArrayList;
import java.util.Scanner;

class SinifYonetimi {
    // 1. Öğrenci nesnelerini saklayan dizi listesi
    private ArrayList<Ogrenci> ogrenciler;
    private final int MEVCUT = 2;

    public SinifYonetimi() {
        this.ogrenciler = new ArrayList<>();
    }

    // İsim ve notları okuyarak listeye kaydeden metod
    public void veriTopla() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < MEVCUT; i++) {
            System.out.println((i + 1) + ". Öğrenci Bilgileri:");
            System.out.print("İsim: ");
            String isim = scanner.next();
            System.out.print("Vize Notu: ");
            double not = scanner.nextDouble();

            // Öğrenci nesnesi oluşturup listeye ekliyoruz
            ogrenciler.add(new Ogrenci(isim, not));
        }
    }

    // 2. Notları okuyarak ortalamayı hesaplayan metod
    public double ortalamaHesapla() {
        double toplam = 0;
        for (Ogrenci ogr : ogrenciler) {
            toplam += ogr.getVizeNotu();
        }
        return ogrenciler.isEmpty() ? 0 : toplam / ogrenciler.size();
    }

    // 3. Ortalamayı ve öğrenci listesini yazdıran metod
    public void raporuYazdir() {
        System.out.println("\n--- SINIF LİSTESİ VE NOTLAR ---");
        for (Ogrenci ogr : ogrenciler) {
            System.out.println("Öğrenci: " + ogr.getIsim() + "\t | Vize: " + ogr.getVizeNotu());
        }

        System.out.println("----------------------------");
        System.out.printf("Sınıfın Genel Ortalaması: %.2f\n", ortalamaHesapla());
    }
}
