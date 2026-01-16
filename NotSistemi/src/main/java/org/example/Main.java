package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /* 15 kişilik mevcudu olan sınıfın vize notlarının ortalamasını bulan
         * 1- notları diziye kaydet
         * 2- notları okuyarak ortalamayı bul
         * 3- ortalamayı yazdır
         */

        SinifYonetimi yonetim = new SinifYonetimi();
        yonetim.veriTopla();
        yonetim.raporuYazdir();


    }
}