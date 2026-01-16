package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Kutuphane {
    private ArrayList<Kitap> kitaplar;
    private final int kapasite=5;

    public Kutuphane() {
        this.kitaplar=new ArrayList<>();
    }
    public void kitaplariOku(){
        Scanner scn=new Scanner(System.in);
        System.out.println(kapasite+ "adet kitap bilgisi girin.");

        for(int i=0;i<kapasite;i++){
            System.out.println("\n" + (i + 1) + ". Kitap:");
            System.out.print("İsim: ");
            String isim = scn.nextLine();
            System.out.print("Yazar: ");
            String yazar = scn.nextLine();
            System.out.print("Fiyat: ");
            double fiyat = scn.nextDouble();
            scn.nextLine(); // Buffer temizleme

            kitaplar.add(new Kitap(isim, yazar, fiyat));
        }
    }
    public double ortalamaBul(){
        double toplam=0;
        for(Kitap k : kitaplar){
            toplam += k.getFiyat();
        }
        return toplam/kitaplar.size();
    }
}
