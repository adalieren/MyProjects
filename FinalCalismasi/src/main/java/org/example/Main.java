package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
         * 15 kişilik mevcudu olan sınıfın vize notlarının ortalamasını bulan
         * kdjasdasd da notları alıyor olacağız
         *
         *
         * 1- notları diziye kaydet
         * 2- notları okuyarak ortalamayı bul
         * 3- ortalamayı yazdır
         *
         * */

        List<Ogrenci> sinif = new ArrayList<>(Arrays.asList(
                new Ogrenci("eren", "adali", 25, 80,70),
                new Ogrenci("ahmet", "yilmaz", 26, 45,60),
                new Ogrenci("ayse", "demir", 27, 55,50)
        ));
        double sinifToplamPuan=0;
        for (Ogrenci ogrenci : sinif) {
            double ortalama = ogrenci.getHesapla();

            sinifToplamPuan += ortalama;


            String durum = (ortalama >= 50) ? "GEÇTİ" : "KALDI";

            // Sonucu Yazdırma
            System.out.println("Öğrenci: " + ogrenci.getAd() + " " + ogrenci.getSoyad());
            System.out.println("Vize: " + ogrenci.getVizeNotu() + " | Final: " + ogrenci.getFinalNotu());
            System.out.println("Yıl Sonu Notu: " + ortalama);
            System.out.println("Durum: " + durum);
            System.out.println("-------------------------");
        }
        double genelOrtalama= sinifToplamPuan / sinif.size();
        System.out.println("Genel Sınıf Ortalaması:" + genelOrtalama);

        }
    }
