package org.example;

import java.util.ArrayList;
import java.util.Scanner;

// Öğrenciyi temsil eden sınıf
class Ogrenci {
    private String isim;
    private double vizeNotu;

    public Ogrenci(String isim, double vizeNotu) {
        this.isim = isim;
        this.vizeNotu = vizeNotu;
    }

    public double getVizeNotu() {
        return vizeNotu;
    }

    public String getIsim() {
        return isim;
    }
}